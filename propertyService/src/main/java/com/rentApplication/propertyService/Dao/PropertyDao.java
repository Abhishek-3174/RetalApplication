package com.rentApplication.propertyService.Dao;

import com.rentApplication.propertyService.Model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDao extends JpaRepository<Property, String> {
}
