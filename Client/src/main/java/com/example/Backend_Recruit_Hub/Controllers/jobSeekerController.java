package com.example.Backend_Recruit_Hub.Controllers;

import com.example.Backend_Recruit_Hub.Models.JobSeeker;
import com.example.Backend_Recruit_Hub.Services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobSeeker")
public class jobSeekerController {
    @Autowired
    JobSeekerService jobSeekerService;

    @PostMapping("/addJobSeeker")
    public ResponseEntity addJobSeeker(@RequestBody JobSeeker jobSeeker){
        String h=jobSeekerService.addJobSeeker(jobSeeker);
        return new ResponseEntity("save successfully", HttpStatus.CREATED);
    }
}
