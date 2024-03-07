package com.rentApplication.propertyService.Controller;

import com.rentApplication.propertyService.Config.ProductRequest;
import com.rentApplication.propertyService.Repository.PropertyDetailsRepository;
import com.rentApplication.propertyService.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("product") 
public class PropertyController {
    @Autowired
    PropertyService propertyService;
    @PostMapping("createProduct")
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest product)
    {
        return propertyService.createProduct(product);
    }
    @GetMapping("products")
    public ResponseEntity<List<PropertyDetailsRepository>> getAllProducts(){
        return propertyService.getProperties();
    }
}
