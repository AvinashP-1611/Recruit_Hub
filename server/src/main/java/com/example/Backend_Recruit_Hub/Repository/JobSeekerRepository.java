package com.example.Backend_Recruit_Hub.Repository;

import com.example.Backend_Recruit_Hub.Models.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends JpaRepository<JobSeeker,Integer> {
}
