package com.example.newProject.dto.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruiterRequest {
    String recName;

    String email;

    String password;

    String mobile;
}
