package com.example.newProject.dto.requestDto;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRequest {
    String jobTitle; //paragraph

    String desc;//string type paragraph

    int jobVacancy; //input

    List<String> requirements; //multiple things in string format

    String salary; //string type input

}
