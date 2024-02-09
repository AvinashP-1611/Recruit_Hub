package com.example.newProject.Repositories;

import com.example.newProject.Models.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepo extends JpaRepository<Recruiter,Integer> {
    Recruiter findById(int id);
}
