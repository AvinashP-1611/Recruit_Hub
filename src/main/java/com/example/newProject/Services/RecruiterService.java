package com.example.newProject.Services;

import com.example.newProject.Entity.CandidateApplyJob;
import com.example.newProject.Entity.Job;
import com.example.newProject.Entity.Recruiter;
import com.example.newProject.Repositories.JobRepo;
import com.example.newProject.Repositories.RecruiterRepo;
import com.example.newProject.Transformer.JobTranformer;
import com.example.newProject.dto.requestDto.JobRequest;
import com.example.newProject.dto.responseDto.JobResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RecruiterService {

    @Autowired
    JobRepo jobRepo;

    @Autowired
    RecruiterRepo recruiterRepo;


    public JobResponse addJob(int id,Job job) {
        Recruiter recruiter=recruiterRepo.findById(id);
        job.setRecruiter(recruiter);

        CandidateApplyJob candidateApplyJob=new CandidateApplyJob();

        jobRepo.save(job);
        return JobTranformer.JobToJobResponse(job);
    }

    public void deleteJob(int id) {
        jobRepo.deleteById(id);
    }

    public void editJob(int id, JobRequest jobRequest) {
        Optional<Job> job=jobRepo.findById(id);
    }
}
