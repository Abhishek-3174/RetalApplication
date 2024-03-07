package com.rentApplication.userService.Controller;

import com.rentApplication.userService.Config.UserRegisterResponse;
import com.rentApplication.userService.Config.UserRequest;
import com.rentApplication.userService.Repository.UserDetailsRepository;
import com.rentApplication.userService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("register")
    public ResponseEntity<UserRegisterResponse> registerUser(@RequestBody UserRequest userRequest)
    {
        return userService.registerUser(userRequest);
    }
    @GetMapping("{userId}")
    public ResponseEntity<UserDetailsRepository> getUserDetails(@RequestParam String userId)
    {
        Optional<UserDetailsRepository> userDetails =  userService.getUserDetails(userId);
        UserDetailsRepository user = userDetails.orElseThrow(()-> new RuntimeException("User not found"));
        return ResponseEntity.ok(user);
    }

}
