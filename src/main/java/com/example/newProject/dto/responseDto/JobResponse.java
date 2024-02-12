package com.example.newProject.dto.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobResponse {
    String jobTitle;

    String description;

    String requirements;

    //Spring Data JPA will automatically populate the createdBy field with
    // the username of the currently authenticated user
    @CreatedBy
    String name;

    @CreatedDate
    Date date;

}
