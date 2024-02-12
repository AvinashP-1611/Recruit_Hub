package com.example.newProject.Controllers;


import com.example.newProject.Entity.Admin;
import com.example.newProject.Entity.User;
import com.example.newProject.Enum.Roles;
import com.example.newProject.Repositories.AdminRepo;
import com.example.newProject.Repositories.CandidateRepo;
import com.example.newProject.Repositories.RecruiterRepo;
import com.example.newProject.Services.AdminService;
import com.example.newProject.Services.CandidateService;
import com.example.newProject.Services.RecruiterService;
import com.example.newProject.dto.requestDto.CandidateRequest;
import com.example.newProject.dto.requestDto.JwtRequest;
import com.example.newProject.dto.responseDto.JwtResponse;
import com.example.newProject.Security.JwtHelper;
import com.example.newProject.Services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JwtHelper helper;

    @Autowired
    UserService userService;


    private Logger logger = LoggerFactory.getLogger(AuthController.class);


    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

        this.doAuthenticate(request.getEmail(), request.getPassword());

        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        String token = this.helper.generateToken(userDetails);

        User user=userService.findByEmail(request.getEmail());

        JwtResponse response = JwtResponse.builder()
                .jwtToken(token)
                .username(userDetails.getUsername())
                .roles(user.getRole()).build();

        return new ResponseEntity<>(response, HttpStatus.OK);
        //now go to either of Admin, recruiter or candidate page , by fetching roles from this json
    }
//    @PostMapping("/addUser") //create account of anyone (admin,recruiter,candidate) ,  http://localhost:8080/user/addUser
//    public User adduser(@RequestBody User user){
//       return userService.addUser(user);
//
//    }

    private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);

        } catch (BadCredentialsException e) {
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }

    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }

}

