package com.eidko.order_service_wc.service;

import com.eidko.order_service_wc.client.ProductClient;
import com.eidko.order_service_wc.dto.OrderRequestDTO;
import com.eidko.order_service_wc.dto.OrderResponseDTO;
import com.eidko.order_service_wc.dto.ProductResponseDTO;
import com.eidko.order_service_wc.entity.Order;
import com.eidko.order_service_wc.repository.OrderRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ProductClient productClient;

    // create order
    public OrderResponseDTO createOrder(OrderRequestDTO requestDTO) {
        System.err.println(requestDTO.getProdId());
        ProductResponseDTO productDTO =
                productClient.getProductById(requestDTO.getProdId());

        Order order = mapper.map(requestDTO, Order.class);
        order.setTotalPrice(productDTO.getPrice() * requestDTO.getQuantity());
        Order savedOrder = repository.save(order);

        OrderResponseDTO responseDTO = new OrderResponseDTO();
        responseDTO.setProductDto(productDTO);
        responseDTO.setId(savedOrder.getId());
        responseDTO.setTotalCost(savedOrder.getTotalPrice());

        return responseDTO;
    }
}
