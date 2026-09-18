package com.eidko.product_service_wc.controller;

import com.eidko.product_service_wc.dto.ProductRequestDTO;
import com.eidko.product_service_wc.dto.ProductResponseDTO;
import com.eidko.product_service_wc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> save(@RequestBody ProductRequestDTO requestDTO){
        return ResponseEntity.ok()
                .body(service.save(requestDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDTO> getProductById(@PathVariable Long id){
        return ResponseEntity.ok()
                .body(service.getProductById(id));
    }
}



