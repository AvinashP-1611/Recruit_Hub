package com.example.newProject.Controllers;

import com.example.newProject.Models.Recruiter;
import com.example.newProject.Services.RecruiterService;
import com.example.newProject.dto.requestDto.JobRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @Autowired
    RecruiterService recruiterService;

    //add jobdesc
    @PostMapping("/addJob")
    public ResponseEntity addJob(@RequestBody JobRequest jobRequest){
        recruiterService.addJob(jobRequest);
        return new ResponseEntity("Save job successfully", HttpStatus.CREATED);
    }
}
