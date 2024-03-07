package com.rentApplication.propertyService.Config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String propertyName;
    private String propertyType;
    private String status;
    private Integer increment;
    private Long rent;
    //test
}
