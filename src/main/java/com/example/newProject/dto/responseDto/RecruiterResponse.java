package com.example.newProject.dto.responseDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruiterResponse {
    String recruiterName;
    String email;
}
