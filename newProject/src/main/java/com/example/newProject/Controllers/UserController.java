package com.example.newProject.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.newProject.Services.UserService;
import com.example.newProject.dto.requestDto.UserRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //adding new user
    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserRequest userRequest){
        userService.adduser(userRequest);
        return new ResponseEntity<>("save",HttpStatus.CREATED);
    }

    //update user details
    @PutMapping("/edit")
    public ResponseEntity<String> editUser(@RequestParam int id, @RequestBody UserRequest userRequest){
        try{
        userService.editUser(id,userRequest);
        return new ResponseEntity<>("Update succesfully",HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>("Reg no not Valid",HttpStatus.NOT_FOUND);
        }
    }
    
}
