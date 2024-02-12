package com.example.newProject.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int jobId;

    String jobTitle;

    String description;

    String requirements;

    int salary;

    //Spring Data JPA will automatically populate the createdBy field with
    // the username of the currently authenticated user

    String createdBy;  // current user

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    Date createdDate;

    @ManyToOne
    @JoinColumn(name = "rec_id")
    Recruiter recruiter;

    @OneToOne
    CandidateApplyJob candidateApplyJob;

}
