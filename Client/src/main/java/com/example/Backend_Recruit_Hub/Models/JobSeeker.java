package com.example.Backend_Recruit_Hub.Models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Blob;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobSeeker")
public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Size(min = 3 , max = 10, message = "Enter valid input")
    @Column(nullable = false)
    String firstName;

    @Size(min = 3 , max = 10, message = "Enter valid input")
    @Column(nullable = false)
    String lastName;

    @Size(min = 10 , max = 10, message = "Enter valid input")
    @Column(nullable = false)
    String phone;

    @Email(message = "Enter valid email")
    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    int experienceInYears;

    @Column(nullable = false)
    int relevantExperience;

    @Column(nullable = false)
    String highestQualificationHeld;

    @Column(nullable = false)
    List<String> skillSet;

    @Column(nullable = false)
    String currentJobTitle;

    @Column(nullable = false)
    String currentWorkLocation;

    @Column(nullable = false)
    String cityName;

    @Column(nullable = false)
    String zipCode;

    //save upload file
    //Blob resumeUpload;

}
