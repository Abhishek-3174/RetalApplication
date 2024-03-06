package com.rentApplication.propertyService.Repository;

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
public class PropertyDetailsRepository {
    @Id
    @GeneratedValue(generator = "custom-id")
    @GenericGenerator(name="custom-id",strategy = "com.rentApplication.propertyService.Repository.GenericIdGenerator.CustomIdGenerator")
    private String id;
    private String propertyName;
    private String propertyType;
    private String status;
    private Integer increment;
    private Long rent;
}
