package com.example.newProject.Controllers;

import com.example.newProject.Entity.User;
import com.example.newProject.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUsers();

    }
}
