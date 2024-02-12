package com.example.newProject.dto.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateResponse {
    String fullName; //input type
    String email; //input type
    String highestQualificationHeld;  //input type
    String skillSet;
    String city;
}
