package com.example.newProject.Transformer;

import com.example.newProject.Enum.Roles;
import com.example.newProject.Models.User;
import com.example.newProject.dto.requestDto.UserRequest;

public class UserTransformer {
    public static User UserRequestToUser(UserRequest userRequest){

        return User.builder().firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .experienceInYears(userRequest.getExperienceInYears())
                .relevantExperience(userRequest.getElevantExperience())
                .highestQualificationHeld(userRequest.getHighestQualificationHeld())
                .skillSet(userRequest.getSkillSet())
                .currentJobTitle(userRequest.getCurrentJobTitle())
                .currentWorkLocation(userRequest.getCurrentWorkLocation())
                .city(userRequest.getCity())
                .zipCode(userRequest.getZipCode())
                .roles(Roles.USER)
                .build();
    }

   
}
