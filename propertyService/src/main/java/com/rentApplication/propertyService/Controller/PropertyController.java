package com.rentApplication.propertyService.Controller;

import com.rentApplication.propertyService.Model.PropertyWrapper;
import com.rentApplication.propertyService.Model.Property;
import com.rentApplication.propertyService.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("property")
public class PropertyController {
    @Autowired
    PropertyService propertyService;
    @PostMapping("createProperty")
    public ResponseEntity<String> createProduct(@RequestBody PropertyWrapper property)
    {
        return propertyService.createProperty(property);
    }
    @GetMapping("properties")
    public ResponseEntity<List<Property>> getAllProducts(){
        return propertyService.getProperties();
    }
}
