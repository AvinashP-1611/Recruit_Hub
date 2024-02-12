package com.example.newProject.Repositories;

import com.example.newProject.Entity.Candidate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate,Integer> {

    Candidate findById(int id);

    List<Candidate> findAll();
    
}
