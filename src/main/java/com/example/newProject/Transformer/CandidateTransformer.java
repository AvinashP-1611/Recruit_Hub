package com.example.newProject.Transformer;

import com.example.newProject.Enum.Roles;
import com.example.newProject.Entity.Candidate;
import com.example.newProject.dto.requestDto.CandidateRequest;
import com.example.newProject.dto.responseDto.CandidateResponse;

public class CandidateTransformer {
    public static Candidate CandidateRequestToCandidate(CandidateRequest candidateRequest){

        return Candidate.builder().fullName(candidateRequest.getFullName())

                .email(candidateRequest.getEmail())
                .mobile(candidateRequest.getMobile())
                .highestQualificationHeld(candidateRequest.getHighestQualificationHeld())
                .skillSet(candidateRequest.getSkillSet())
                .city(candidateRequest.getCity())

                .roles(Roles.CANDIDATE)
                .build();
    }
    public static CandidateResponse CandidateToCandidateResponse(Candidate candidate){

        return CandidateResponse.builder().fullName(candidate.getFullName())

                .email(candidate.getEmail())
                .highestQualificationHeld(candidate.getHighestQualificationHeld())
                .skillSet(candidate.getSkillSet())
                .city(candidate.getCity())

                .build();
    }

   
}
