package com.example.newProject.Models;

import com.example.newProject.Enum.Roles;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int recId;

    String recName;

    String email;

    String password;

    String mobile;

    Roles roles;

//    @OneToMany
//    @JoinColumn
//    List<JobDescription>jobDescriptionList=new ArrayList<>();

}
