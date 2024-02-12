package com.example.newProject.Repositories;

import com.example.newProject.Entity.Job;
import com.example.newProject.Entity.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RecruiterRepo extends JpaRepository<Recruiter,Integer> {
    Recruiter findById(int id);

    @Query(value = "SELECT * FROM recruiter WHERE email=:name",nativeQuery = true)
    Recruiter findByEmail(String name);

//    @Query(value = "SELECT * FROM job WHERE createdBy=:createdBy",nativeQuery = true)
//    Job findByCreateBy(String createdBy);
}
