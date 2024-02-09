package com.example.newProject.Services;

import javax.management.RuntimeErrorException;

import com.example.newProject.Models.JobDescription;
import com.example.newProject.Repositories.JobDescriptionRepo;
import com.example.newProject.dto.requestDto.JobRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.newProject.Models.User;
import com.example.newProject.Repositories.UserRepo;
import com.example.newProject.Transformer.UserTransformer;
import com.example.newProject.dto.requestDto.UserRequest;

import java.util.List;

import static com.example.newProject.Validation.*;



@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    @Autowired
    JobDescriptionRepo jobDescriptionRepo;

    //add user
    public void adduser(UserRequest userRequest) {
         if(!isValidEmail(userRequest.getEmail())) throw new RuntimeException("Enter valid input");
         if(!isValidNameLength(userRequest.getFirstName())) throw new RuntimeException("Enter valid name credentials");
         if(!isValidPhoneNumber(userRequest.getMobile())) throw new RuntimeException("Please enter valid phone number");
        User user=UserTransformer.UserRequestToUser(userRequest);

        List<JobDescription> jobList=jobDescriptionRepo.findAll();
        user.setJobDescriptionList(jobList);
        userRepo.save(user);

    }

    
    //first check in database then grant to edit
    public void editUser(int id,@RequestBody UserRequest userRequest) {
        //if reg no is not valid
        User user=userRepo.findById(id);
        if(user==null) throw new RuntimeException("Registration No is not valid");
        userRepo.delete(user); //for not repeating values;

        //else
        User newUser=UserTransformer.UserRequestToUser(userRequest);

        userRepo.save(newUser);
        
    }

}
