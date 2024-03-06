package com.rentApplication.propertyService.Service;

import com.rentApplication.propertyService.Config.ProductRequest;
import com.rentApplication.propertyService.Dao.PropertyDetails;
import com.rentApplication.propertyService.Repository.PropertyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class PropertyService {
    @Autowired
    private PropertyDetails propertyDetails;
    public ResponseEntity<String> createProduct(ProductRequest productRequest)
    {
        PropertyDetailsRepository product = PropertyDetailsRepository.builder()
                .propertyName(productRequest.getPropertyName())
                .propertyType(productRequest.getPropertyType())
                .status(productRequest.getStatus())
                .rent(productRequest.getRent())
                .increment(productRequest.getIncrement())
                .build();
        propertyDetails.save(product);
        return ResponseEntity.ok("Product Has Been Created Successfully");
    }
}
