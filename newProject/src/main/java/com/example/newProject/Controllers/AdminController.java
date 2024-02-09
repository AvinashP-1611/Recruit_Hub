package com.example.newProject.Controllers;

import java.util.List;

import com.example.newProject.Models.Recruiter;
import com.example.newProject.dto.requestDto.AdminRequest;
import com.example.newProject.dto.requestDto.RecruiterRequest;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.example.newProject.Models.Admin;
import com.example.newProject.Models.User;
import com.example.newProject.Services.AdminService;
import com.example.newProject.dto.responseDto.AdminResponse;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    

    @PostMapping("/addAdmin")
    public ResponseEntity addAdmin(@RequestBody AdminRequest adminRequest){
        adminService.addAdmin(adminRequest);
        return new ResponseEntity<>("Admin saved",HttpStatus.CREATED);
    }

    //add recruiter
    @PostMapping("/addRecruiter")
    public ResponseEntity addRecruiter(@RequestBody RecruiterRequest recruiterRequest){
        adminService.addRecruiter(recruiterRequest);
        return new ResponseEntity<>("Recruiter saved",HttpStatus.CREATED);
    }
    //delete recruiter
    @DeleteMapping("/deleteRecruiter")
    public ResponseEntity deleteRecruiter(@RequestParam int id){
        //admin can delete this
        adminService.deleteRecruiter(id);
        return new ResponseEntity("delete recruiter",HttpStatus.FOUND);
    }

    //get all users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = adminService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    //get user by id
     @GetMapping("/users/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = adminService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //only admin has rights
   
    //delete by admin only
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam int id){
        try{
        adminService.deleteUser(id);
        return new ResponseEntity<>("User data delete successfully",HttpStatus.FOUND);
        }
        catch(Exception e){
            return new ResponseEntity<>("Invalid regno",HttpStatus.NOT_FOUND);
        }
    }


    //generate token for admin for encrypt his data/password
//    @PostMapping("/generateToken")
//    public String authenticateAndGetToken(@RequestBody AdminResponse adminResponse) {
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(adminResponse.getEmail(), adminResponse.getPassword()));
//        if (authentication.isAuthenticated()) {
//            return jwtService.generateToken(adminResponse.getEmail());
//        } else {
//            throw new UsernameNotFoundException("invalid user request !");
//        }
//    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> runtimeException(RuntimeException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    
}
