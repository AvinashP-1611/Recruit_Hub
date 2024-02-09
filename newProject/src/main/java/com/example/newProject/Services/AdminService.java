package com.example.newProject.Services;

import java.util.List;

import com.example.newProject.Models.Recruiter;
import com.example.newProject.Repositories.RecruiterRepo;
import com.example.newProject.Transformer.AdminTransformer;
import com.example.newProject.Transformer.RecruiterTransformer;
import com.example.newProject.dto.requestDto.AdminRequest;
import com.example.newProject.dto.requestDto.RecruiterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newProject.Models.Admin;
import com.example.newProject.Models.User;
import com.example.newProject.Repositories.AdminRepo;
import com.example.newProject.Repositories.UserRepo;

@Service
public class AdminService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    RecruiterRepo recruiterRepo;

   @Autowired
   AdminRepo adminRepo;
    
    //get list of all user
    public List<User> getAllUsers() {
       return userRepo.findAll();
    }

    //find by regNo
    public User getUserById(int id) {
        User user=userRepo.findById(id);
       if(user==null) throw new RuntimeException("Regno not found / Invalid regno");
       return user; //admin can acess all the fields
    }

    public void deleteUser(int id) {
        User user=userRepo.findById(id);
       if(user==null) throw new RuntimeException("Regno not found / Invalid regno");
       userRepo.delete(user);
    }

    //add admin
    public void addAdmin(AdminRequest adminRequest) {
        Admin admin= AdminTransformer.AdminRequestToAdmin(adminRequest);
        adminRepo.save(admin);
    }


    public void addRecruiter(RecruiterRequest recruiterRequest) {

         Recruiter recruiter= RecruiterTransformer.RecruiterRequestToRecruiter(recruiterRequest);
         recruiterRepo.save(recruiter);
    }

    public void deleteRecruiter(int id) {
        Recruiter recruiter= recruiterRepo.findById(id);
        recruiterRepo.delete(recruiter);
    }
}
