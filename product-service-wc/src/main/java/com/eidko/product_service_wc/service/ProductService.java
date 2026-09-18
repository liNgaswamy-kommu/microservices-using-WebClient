package com.eidko.product_service_wc.service;

import com.eidko.product_service_wc.dto.ProductRequestDTO;
import com.eidko.product_service_wc.dto.ProductResponseDTO;
import com.eidko.product_service_wc.entity.Product;
import com.eidko.product_service_wc.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper mapper;

    public ProductResponseDTO save(ProductRequestDTO requestDTO){
        Product product = mapper.map(requestDTO, Product.class);
        Product savedProduct = repository.save(product);
        return mapper.map(savedProduct, ProductResponseDTO.class);
    }

    public ProductResponseDTO getProductById(Long id){
        Product product = repository.findById(id).orElseThrow(()->{
            throw new RuntimeException("product not found with id :"+id);
        });
        return mapper.map(product, ProductResponseDTO.class);
    }
}
