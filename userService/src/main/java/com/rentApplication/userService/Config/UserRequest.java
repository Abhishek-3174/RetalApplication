package com.rentApplication.userService.Config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest    {
    private String username;
    private String name;
    private String address;
    private String role;
    private String password;
    private String email;
    private String gender;
    private String age;
}
