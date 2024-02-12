package com.example.newProject.Controllers;

import java.util.List;

import com.example.newProject.Entity.Job;
import com.example.newProject.dto.requestDto.AdminRequest;
import com.example.newProject.dto.requestDto.CandidateRequest;
import com.example.newProject.dto.requestDto.RecruiterRequest;
import com.example.newProject.dto.responseDto.AdminResponse;
import com.example.newProject.dto.responseDto.CandidateResponse;
import com.example.newProject.dto.responseDto.RecruiterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.newProject.Entity.Candidate;
import com.example.newProject.Services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    

    @PostMapping("/addAdmin")
    public ResponseEntity addAdmin(@RequestBody AdminRequest adminRequest){
        AdminResponse adminResponse=adminService.addAdmin(adminRequest);
        return new ResponseEntity<>(adminResponse,HttpStatus.CREATED);
    }

    //add recruiter
    @PostMapping("/addRecruiter")
    public ResponseEntity addRecruiter(@RequestBody RecruiterRequest recruiterRequest){
        RecruiterResponse recruiterResponse=adminService.addRecruiter(recruiterRequest);
        return new ResponseEntity<>(recruiterResponse,HttpStatus.CREATED);
    }

    //adding new user
    @PostMapping("/addCandidate")
    public ResponseEntity addCandidate(@RequestBody CandidateRequest candidateRequest){
        CandidateResponse candidateResponse=adminService.addCandidate(candidateRequest);
        return new ResponseEntity(candidateResponse,HttpStatus.CREATED);
    }
    //delete recruiter
    @DeleteMapping("/deleteRecruiter")
    public ResponseEntity deleteRecruiter(@RequestParam int id){
        //admin can delete this
        adminService.deleteRecruiter(id);
        return new ResponseEntity("delete recruiter",HttpStatus.FOUND);
    }

   
    //delete by admin only
    @DeleteMapping("/deleteCandidate")
    public ResponseEntity<String> deleteUser(@RequestParam int id){
        try{
        adminService.deleteCandidate(id);
        return new ResponseEntity<>("Candidate data delete successfully",HttpStatus.FOUND);
        }
        catch(Exception e){
            return new ResponseEntity<>("Invalid regno",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getJob")
    public ResponseEntity getAll(){
        List<Job> jobList=adminService.findAll();
        return new ResponseEntity(jobList,HttpStatus.FOUND);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> runtimeException(RuntimeException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    
}
