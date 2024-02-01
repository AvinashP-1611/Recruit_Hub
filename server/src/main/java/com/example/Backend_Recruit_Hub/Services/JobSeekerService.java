package com.example.Backend_Recruit_Hub.Services;

import com.example.Backend_Recruit_Hub.Models.JobSeeker;
import com.example.Backend_Recruit_Hub.Repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerService {
    @Autowired
    JobSeekerRepository jobSeekerRepository;
    public String addJobSeeker(JobSeeker jobSeeker) {
        jobSeekerRepository.save(jobSeeker);
        return "save";
    }
}
