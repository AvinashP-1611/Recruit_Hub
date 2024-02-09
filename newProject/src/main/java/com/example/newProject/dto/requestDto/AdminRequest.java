package com.example.newProject.dto.requestDto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminRequest {
    String adminName;

    String email;

    String password;
}
