package com.rentApplication.propertyService.Model;

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
@Entity(name = "Property")
public class Property {
    @Id
    @GeneratedValue(generator = "custom-id")
    @GenericGenerator(name="custom-id",strategy = "com.rentApplication.propertyService.Service.CustomIdGenerator")
    private String id;
    private String propertyName;
    private String propertyType;
    private String status;
    private Integer increment;
    private Long rent;
}
