package com.example.newProject.dto.responseDto;

import com.example.newProject.Enum.Roles;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JwtResponse { //response
    String jwtToken;
    String username;
    Roles roles;
}
