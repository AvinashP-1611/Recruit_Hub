package com.example.newProject.Services;

import com.example.newProject.Entity.User;
import com.example.newProject.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    //create account
//    public User addUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepo.save(user);
//    }
    public List<User> getUsers(){
        return userRepo.findAll();
    }


    public User findByEmail(String email) {
       return userRepo.findByEmail(email);
    }
}
