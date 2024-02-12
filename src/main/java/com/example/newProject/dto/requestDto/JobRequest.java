package com.example.newProject.dto.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobRequest {
    String jobTitle;

    String description;

    String requirements;

    int salary;
}
