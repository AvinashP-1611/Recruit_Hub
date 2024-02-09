package com.example.newProject.Services;

import com.example.newProject.Models.JobDescription;
import com.example.newProject.Repositories.JobDescriptionRepo;
import com.example.newProject.Transformer.JobDescTransformer;
import com.example.newProject.dto.requestDto.JobRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruiterService {
    @Autowired
    JobDescriptionRepo jobDescriptionRepo;

    public void addJob(JobRequest jobRequest) {
        JobDescription jobDescription= JobDescTransformer.JobRequestToJobDescription(jobRequest);
        //need to add current recruiter
        jobDescriptionRepo.save(jobDescription);
    }
}
