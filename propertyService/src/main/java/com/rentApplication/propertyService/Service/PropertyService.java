package com.rentApplication.propertyService.Service;

import com.rentApplication.propertyService.Config.ProductRequest;
import com.rentApplication.propertyService.Dao.PropertyDetails;
import com.rentApplication.propertyService.Repository.PropertyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertyService {
    @Autowired
    private PropertyDetails propertyDetails;
    public ResponseEntity<String> createProduct(ProductRequest productRequest)
    {
        System.out.println("In Service");
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

    public ResponseEntity<List<PropertyDetailsRepository>> getProperties() {
        return new ResponseEntity<>(propertyDetails.findAll(), HttpStatus.OK);
    }
}
