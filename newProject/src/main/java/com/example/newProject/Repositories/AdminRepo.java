package com.example.newProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newProject.Models.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer>{
    
}
