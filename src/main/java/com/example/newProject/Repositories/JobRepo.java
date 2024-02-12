package com.example.newProject.Repositories;

import com.example.newProject.Entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepo extends JpaRepository<Job,Integer> {
    List<Job> findAll();
}
