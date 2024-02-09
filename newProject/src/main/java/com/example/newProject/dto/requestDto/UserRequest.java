package com.example.newProject.dto.requestDto;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest { //need to implement**
    String firstName; //input type
    String lastName; //input type

    String email; //input type
    String mobile; //input type
    short experienceInYears; //option
    short elevantExperience; //option
    String highestQualificationHeld;  //input type  
    List<Integer> skillSet; //checkbox option
    String currentJobTitle; //input type
    String currentWorkLocation; //option type
    String city; //option type
    String zipCode;
    
}
