package com.rentApplication.propertyService.Dao;

import com.rentApplication.propertyService.Repository.PropertyDetailsRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDetails extends JpaRepository<PropertyDetailsRepository, String> {
}
