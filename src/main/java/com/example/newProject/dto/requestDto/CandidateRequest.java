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
public class CandidateRequest { //need to implement**
    String fullName; //input type
    String email; //input type
    String mobile; //input type
    String password;
    String highestQualificationHeld;  //input type  
    String skillSet; //checkbox option
    String city; //option type

}
