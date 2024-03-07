package com.rentApplication.userService.Dao;

import com.rentApplication.userService.Repository.UserDetailsRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetails extends JpaRepository<UserDetailsRepository,String> {
}
