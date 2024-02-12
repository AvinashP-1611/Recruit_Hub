package com.example.newProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newProject.Entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer>{
    
}
