package com.rentApplication.propertyService.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyWrapper {
    private String propertyName;
    private String propertyType;
    private String status;
    private Integer increment;
    private Long rent;
}
