package com.eidko.order_service_wc.client;

import com.eidko.order_service_wc.dto.ProductResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ProductClient {

    private final WebClient webClient;

    public ProductClient(WebClient.Builder builder){
        this.webClient = builder
                .baseUrl("http://product-service")
                .build();
    }

    public ProductResponseDTO getProductById(Long id){
        return webClient.get()
                .uri("/products/"+id)
                .retrieve()
                .bodyToMono(ProductResponseDTO.class)
                .block();
    }
}
