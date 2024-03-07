package com.rentApplication.userService.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "UserInformation")
public class UserDetailsRepository {
    @Id
    @GeneratedValue(generator = "custom-id")
    @GenericGenerator(name="custom-id",strategy = "com.rentApplication.userService.Repository.GenericIdGenerator.CustomIdGenerator")
    private String id;
    @Column(unique = true)
    private String username;
    private String name;
    private String address;
    private String role;
    private String password;
    @Column(unique = true)
    private String email;
    private String gender;
    private String age;
}
