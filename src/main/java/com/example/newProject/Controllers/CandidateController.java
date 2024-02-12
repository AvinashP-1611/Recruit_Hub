package com.example.newProject.Controllers;

import com.example.newProject.Entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.newProject.Services.CandidateService;
import com.example.newProject.dto.requestDto.CandidateRequest;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;


    //update user details
    @PutMapping("/edit")
    public ResponseEntity<String> editUser(@RequestParam int id, @RequestBody CandidateRequest candidateRequest){
        try{
        candidateService.editUser(id, candidateRequest);
        return new ResponseEntity<>("Update successfully",HttpStatus.CREATED);
        }
        catch(Exception e){
            return new ResponseEntity<>("Reg no not Valid",HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/getJob")
    public List<Job> getJob(){
       List<Job> jobList= candidateService.getJob();
        return jobList;
    }

//    @PostMapping("/addJobApply")
//    public ResponseEntity addJobApply(){
//
//    }
//
}
