package com.example.newProject.Entity;

import com.example.newProject.Enum.Roles;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int adminId;

    String adminName;
 
    String email;

    String password;

    String mobile;

    @Enumerated(value = EnumType.STRING)
    Roles roles; //option only 3 values admin, user, recruiter;
   
}
