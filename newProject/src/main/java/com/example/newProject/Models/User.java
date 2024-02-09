package com.example.newProject.Models;

import com.example.newProject.Enum.Roles;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;


@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User { //no need
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;

    String firstName; //input type
    String lastName; //input type

    String email; //input type
    String mobile; //input type
    short experienceInYears; //option in number
    short relevantExperience; //option in number
    String highestQualificationHeld;  //input type  
    List<Integer> skillSet; //checkbox option
    String currentJobTitle; //input type
    String currentWorkLocation; //option type
    String city; //option type
    String zipCode; //input type

    Roles roles; //assigning role

    @OneToMany
    @JoinColumn
    List<JobDescription> jobDescriptionList=new ArrayList<>();

// ▪ Resume Upload

}
