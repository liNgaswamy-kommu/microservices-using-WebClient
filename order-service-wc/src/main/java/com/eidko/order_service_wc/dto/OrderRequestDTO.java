package com.eidko.order_service_wc.dto;

import lombok.Data;

@Data
public class OrderRequestDTO {
    private Long prodId;
    private Integer quantity;
}
