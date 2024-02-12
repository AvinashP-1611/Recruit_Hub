package com.example.newProject.Transformer;

import com.example.newProject.Entity.Admin;
import com.example.newProject.Enum.Roles;
import com.example.newProject.dto.requestDto.AdminRequest;
import com.example.newProject.dto.responseDto.AdminResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.example.newProject.Enum.Roles.ADMIN;

public class AdminTransformer {

    public static AdminResponse AdminToAdminResponse(Admin admin){
        return AdminResponse.builder()
                .email(admin.getEmail())
                .adminName(admin.getAdminName())
                .build();
    }

    public static Admin AdminRequestToAdmin(AdminRequest adminRequest){
        return Admin.builder()
                .adminName(adminRequest.getAdminName())
                .email(adminRequest.getEmail())
                .password(adminRequest.getPassword())
                .mobile(adminRequest.getMobile())
                .roles(Roles.ADMIN)
                .build();
    }
}
