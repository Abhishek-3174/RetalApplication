package com.rentApplication.propertyService.Service;

import com.rentApplication.propertyService.Model.PropertyWrapper;
import com.rentApplication.propertyService.Dao.PropertyDao;
import com.rentApplication.propertyService.Model.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PropertyService {
    @Autowired
    private PropertyDao propertyDao;
    public ResponseEntity<String> createProperty(PropertyWrapper propertyWrapper)
    {
        System.out.println("In Service");
        Property product = Property.builder()
                .propertyName(propertyWrapper.getPropertyName())
                .propertyType(propertyWrapper.getPropertyType())
                .status(propertyWrapper.getStatus())
                .rent(propertyWrapper.getRent())
                .increment(propertyWrapper.getIncrement())
                .build();
        propertyDao.save(product);
        return ResponseEntity.ok("Property Has Been Created Successfully");
    }

    public ResponseEntity<List<Property>> getProperties() {
        return new ResponseEntity<>(propertyDao.findAll(), HttpStatus.OK);
    }
}
