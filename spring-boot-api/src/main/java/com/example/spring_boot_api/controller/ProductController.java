package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.domain.product.Product;
import com.example.spring_boot_api.domain.product.ProductRequestDTO;
import com.example.spring_boot_api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;
    @PostMapping()
    public postProduct(@RequestBody @Valid ProductRequestDTO data){
        Product newproduct = new Product(data);

        productRepository.save(newproduct);
        return ResponseEntity.ok(newproduct);

    }

}
