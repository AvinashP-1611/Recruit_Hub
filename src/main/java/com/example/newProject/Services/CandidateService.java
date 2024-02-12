package com.example.newProject.Services;

import com.example.newProject.Entity.Candidate;
import com.example.newProject.Entity.Job;
import com.example.newProject.Repositories.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.newProject.Repositories.CandidateRepo;
import com.example.newProject.Transformer.CandidateTransformer;
import com.example.newProject.dto.requestDto.CandidateRequest;

import java.util.List;


@Service
public class CandidateService {
    
    @Autowired
    CandidateRepo candidateRepo;


    @Autowired
    JobRepo jobRepo;
    //add user
    
    //first check in database then grant to edit
    public void editUser(int id,@RequestBody CandidateRequest candidateRequest) {
        //if reg no is not valid
        Candidate candidate = candidateRepo.findById(id);
        if(candidate ==null) throw new RuntimeException("Registration No is not valid");
        candidateRepo.delete(candidate); //for not repeating values;

        //else
        Candidate newCandidate = CandidateTransformer.CandidateRequestToCandidate(candidateRequest);

        candidateRepo.save(newCandidate);
        
    }

    public List<Job> getJob() {
        return jobRepo.findAll();
    }
}
