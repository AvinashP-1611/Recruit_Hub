package com.example.newProject.Services;

import java.util.List;

import com.example.newProject.Entity.*;
import com.example.newProject.Enum.Roles;
import com.example.newProject.Repositories.*;
import com.example.newProject.Transformer.AdminTransformer;
import com.example.newProject.Transformer.RecruiterTransformer;
import com.example.newProject.Transformer.CandidateTransformer;
import com.example.newProject.dto.requestDto.AdminRequest;
import com.example.newProject.dto.requestDto.CandidateRequest;
import com.example.newProject.dto.requestDto.RecruiterRequest;
import com.example.newProject.dto.responseDto.AdminResponse;
import com.example.newProject.dto.responseDto.CandidateResponse;
import com.example.newProject.dto.responseDto.RecruiterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.example.newProject.Validation.*;

@Service
public class AdminService {
    @Autowired
    CandidateRepo candidateRepo;

    @Autowired
    RecruiterRepo recruiterRepo;

   @Autowired
   AdminRepo adminRepo;
   @Autowired
   UserRepo userRepo;

   @Autowired
   JobRepo jobRepo;

    @Autowired
    PasswordEncoder passwordEncoder;



    //add admin
    public AdminResponse addAdmin(AdminRequest adminRequest) {
        Admin admin= AdminTransformer.AdminRequestToAdmin(adminRequest);
        validations(adminRequest.getEmail(), adminRequest.getAdminName(), adminRequest.getMobile());

        addUser(admin.getEmail(), admin.getPassword(), Roles.ADMIN);
        adminRepo.save(admin);

        return AdminTransformer.AdminToAdminResponse(admin);
    }


    public RecruiterResponse addRecruiter(RecruiterRequest recruiterRequest) {

         Recruiter recruiter= RecruiterTransformer.RecruiterRequestToRecruiter(recruiterRequest);
         validations(recruiterRequest.getEmail(), recruiterRequest.getRecName(), recruiterRequest.getMobile());
         addUser(recruiterRequest.getEmail(),recruiterRequest.getPassword(),Roles.RECRUITER);
         recruiterRepo.save(recruiter);

         return RecruiterTransformer.RecruiterToRecruiterResponse(recruiter);
    }

    public void deleteRecruiter(int id) {
        Recruiter recruiter= recruiterRepo.findById(id);
        recruiterRepo.delete(recruiter);
    }

    //add candidate
    public CandidateResponse addCandidate(CandidateRequest candidateRequest) {
        //let's first check inputs
        validations(candidateRequest.getEmail(),candidateRequest.getFullName(),candidateRequest.getMobile());

        Candidate candidate = CandidateTransformer.CandidateRequestToCandidate(candidateRequest);

        candidate.setPassword(passwordEncoder.encode(candidateRequest.getPassword()));

        //add the user into database
        addUser(candidateRequest.getEmail(),candidateRequest.getPassword(),Roles.CANDIDATE);

        candidateRepo.save(candidate);

        return CandidateTransformer.CandidateToCandidateResponse(candidate);

    }

    public void deleteCandidate(int id) {
        Candidate candidate=candidateRepo.findById(id);
        candidateRepo.delete(candidate);
    }

    //function for add user into database
    private void addUser(String email, String password, Roles roles){
        User user=User.builder()
                .email(email)
                .password(passwordEncoder.encode(password))
                .role(roles)
                .build();
        userRepo.save(user);
    }

    //function for check validations
    private void validations(String email, String name, String mobile){
        if(!isValidEmail(email)) throw new RuntimeException("Enter valid input");
        if(!isValidNameLength(name)) throw new RuntimeException("Enter valid name credentials");
        if(!isValidPhoneNumber(mobile)) throw new RuntimeException("Please enter valid phone number");
    }

    public void addJob(Job job) {
        jobRepo.save(job);
    }

    public List<Job> findAll() {
        return jobRepo.findAll();
    }
}
