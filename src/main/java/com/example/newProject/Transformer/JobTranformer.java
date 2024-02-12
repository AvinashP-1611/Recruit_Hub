package com.example.newProject.Transformer;

import com.example.newProject.Entity.Job;
import com.example.newProject.Entity.User;
import com.example.newProject.dto.requestDto.JobRequest;
import com.example.newProject.dto.responseDto.JobResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class JobTranformer {

    public static Job JobRequestToJob(JobRequest jobRequest){
        String name="values";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            name=authentication.getName(); // Returns the username
        } else {
            name="not found"; // No user authenticated
        }

        return Job.builder()
                .jobTitle(jobRequest.getJobTitle())
                .description(jobRequest.getDescription())
                .salary(jobRequest.getSalary())
                .requirements(jobRequest.getRequirements())
                .createdBy(name)
                .build();
    }
    public static JobResponse JobToJobResponse(Job job){
        return JobResponse.builder()
                        .jobTitle(job.getJobTitle())
                .description(job.getDescription())
                .requirements(job.getRequirements())
                .name(job.getCreatedBy())
                .date(job.getCreatedDate())
                . build();
    }
}
