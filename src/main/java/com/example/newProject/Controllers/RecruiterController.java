package com.example.newProject.Controllers;

import com.example.newProject.Entity.Job;
import com.example.newProject.Entity.User;
import com.example.newProject.Services.RecruiterService;
import com.example.newProject.Transformer.JobTranformer;
import com.example.newProject.dto.requestDto.JobRequest;
import com.example.newProject.dto.responseDto.JobResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {
    @Autowired
    RecruiterService recruiterService;

    //add jobdesc

    @PostMapping("/addJob")
    public ResponseEntity addJob(@RequestParam int id, @RequestBody JobRequest jobRequest){
        Job job= JobTranformer.JobRequestToJob(jobRequest);

        JobResponse jobResponse=recruiterService.addJob(id,job);
        return new ResponseEntity(jobResponse,HttpStatus.CREATED);
    }

    //delete job
    @DeleteMapping("/deleteJob")
    public ResponseEntity deleteJob(@RequestParam int id){
        recruiterService.deleteJob(id);
        return new ResponseEntity("delete",HttpStatus.CREATED);
    }
    @PutMapping("/editJob")
    public ResponseEntity editJob(@RequestParam int id,@RequestBody JobRequest jobRequest){
        recruiterService.editJob(id,jobRequest);
        return new ResponseEntity("edit",HttpStatus.CREATED);
    }
}
