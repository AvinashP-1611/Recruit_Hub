package com.example.newProject.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int jobDesId;

    String jobTitle; //paragraph

    String desc;//string type paragraph

    int jobVacancy; //input

    List<String> requirements; //multiple things in string format

    String salary; //string type input

    //String emailRecruiter;

}
