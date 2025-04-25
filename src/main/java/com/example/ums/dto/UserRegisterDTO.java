package com.example.ums.dto;

import com.example.ums.entity.Role;
import lombok.Data;

@Data
public class UserRegisterDTO {
    private String username;
    private String password;
    private Role role;
}
