package com.example.newProject.Transformer;

import com.example.newProject.Enum.Roles;
import com.example.newProject.Entity.Recruiter;
import com.example.newProject.dto.requestDto.RecruiterRequest;
import com.example.newProject.dto.responseDto.RecruiterResponse;

public class RecruiterTransformer {
    public static Recruiter RecruiterRequestToRecruiter(RecruiterRequest recruiterRequest){
        return  Recruiter.builder()
                .email(recruiterRequest.getEmail())
                .password(recruiterRequest.getPassword())
                .mobile(recruiterRequest.getMobile())
                .recName(recruiterRequest.getRecName())
                .roles(Roles.RECRUITER)
                .build();
    }
    public static RecruiterResponse RecruiterToRecruiterResponse(Recruiter recruiter){
        return RecruiterResponse.builder()
                .recruiterName(recruiter.getRecName())
                .email(recruiter.getEmail())
                .build();
    }
}
