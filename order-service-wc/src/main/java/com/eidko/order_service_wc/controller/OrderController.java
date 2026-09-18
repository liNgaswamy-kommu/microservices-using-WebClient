package com.eidko.order_service_wc.controller;

import com.eidko.order_service_wc.dto.OrderRequestDTO;
import com.eidko.order_service_wc.dto.OrderResponseDTO;
import com.eidko.order_service_wc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public ResponseEntity<OrderResponseDTO> createOrder
            (@RequestBody OrderRequestDTO requestDTO){
        return ResponseEntity.ok()
                .body(service.createOrder(requestDTO));
    }
}
