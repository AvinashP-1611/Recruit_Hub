package com.example.newProject.Transformer;

import com.example.newProject.Enum.Roles;
import com.example.newProject.Models.Recruiter;
import com.example.newProject.dto.requestDto.RecruiterRequest;

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
}
