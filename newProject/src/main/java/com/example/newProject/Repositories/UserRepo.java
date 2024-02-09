package com.example.newProject.Repositories;

import com.example.newProject.Models.User;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    User findById(int id);

    List<User> findAll();
    
}
