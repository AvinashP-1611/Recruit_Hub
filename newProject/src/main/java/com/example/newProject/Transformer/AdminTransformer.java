package com.example.newProject.Transformer;

import com.example.newProject.Models.Admin;
import com.example.newProject.dto.requestDto.AdminRequest;
import com.example.newProject.dto.responseDto.AdminResponse;

import static com.example.newProject.Enum.Roles.ADMIN;

public class AdminTransformer {
    public static AdminResponse AdminToAdminResponse(Admin admin){
        return AdminResponse.builder()
                .email(admin.getEmail())
                .password(admin.getPassword()).build();
    }
    public static Admin AdminRequestToAdmin(AdminRequest adminRequest){
        return Admin.builder()
                .adminName(adminRequest.getAdminName())
                .email(adminRequest.getEmail())
                .password(adminRequest.getPassword())
                .roles(ADMIN)
                .build();
    }
}
