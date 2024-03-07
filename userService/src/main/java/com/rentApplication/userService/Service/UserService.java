package com.rentApplication.userService.Service;

import com.rentApplication.userService.Config.UserRegisterResponse;
import com.rentApplication.userService.Config.UserRequest;
import com.rentApplication.userService.Dao.UserDetails;
import com.rentApplication.userService.Repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDetails userDetails;
    public ResponseEntity<UserRegisterResponse> registerUser(UserRequest userRequest)
    {
        UserDetailsRepository userDetailsRepository = UserDetailsRepository.builder()
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .name(userRequest.getName())
                .age(userRequest.getAge())
                .role(userRequest.getRole())
                .email(userRequest.getEmail())
                .address(userRequest.getAddress())
                .gender(userRequest.getGender())
                .build();
        UserDetailsRepository savedUser = userDetails.save(userDetailsRepository);
        if(savedUser != null) {
            UserRegisterResponse userRegisterResponse = UserRegisterResponse.builder()
                    .userId(savedUser.getId())
                    .message("User Registered Successfully")
                    .build();
            return ResponseEntity.ok(userRegisterResponse);
        }
        UserRegisterResponse userRegisterResponse = UserRegisterResponse.builder()
                .userId("No User Id")
                .message("User Registration Failed")
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(userRegisterResponse);
    }
    public Optional<UserDetailsRepository> getUserDetails(String userId)
    {
        return userDetails.findById(userId);
    }
}
