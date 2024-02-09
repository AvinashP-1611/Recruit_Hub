package com.example.newProject.Repositories;

import com.example.newProject.Models.JobDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDescriptionRepo extends JpaRepository<JobDescription,Integer> {
}
