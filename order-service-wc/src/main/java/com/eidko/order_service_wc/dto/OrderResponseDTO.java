package com.eidko.order_service_wc.dto;

import lombok.Data;

@Data
public class OrderResponseDTO {
    private ProductResponseDTO productDto;
    private Long id;
    private Double totalCost;
}
