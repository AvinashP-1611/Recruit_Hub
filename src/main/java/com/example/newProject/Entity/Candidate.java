package com.example.newProject.Entity;

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
public class Candidate { //no need
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int candidateId;

    String fullName; //input type
    String password;
    String email; //input type
    String mobile; //input type
    String highestQualificationHeld;  //input type  
    String skillSet; //checkbox option
    String city; //option type

    @Enumerated(value = EnumType.STRING)
    Roles roles; //assigning role


// ▪ Resume Upload

}
