package com.example.newProject.Transformer;

import com.example.newProject.Models.JobDescription;
import com.example.newProject.dto.requestDto.JobRequest;

public class JobDescTransformer {
    public static JobDescription JobRequestToJobDescription(JobRequest jobRequest){
        return JobDescription.builder()
                .desc(jobRequest.getDesc())
                .jobTitle(jobRequest.getJobTitle())
                .jobVacancy(jobRequest.getJobVacancy())
                .requirements(jobRequest.getRequirements())
                .salary(jobRequest.getSalary())
                .build();
    }
}
