package com.eidko.order_service_wc.client;

import com.eidko.order_service_wc.dto.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ProductClient {

    @Autowired
    private WebClient webClient;

    public ProductResponseDTO getProductById(Long id){
        return webClient.get()
                .uri("/products/"+id)
                .retrieve()
                .bodyToMono(ProductResponseDTO.class)
                .block();
    }
}
