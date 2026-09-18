package com.eidko.order_service_wc.config;

import com.eidko.order_service_wc.dto.OrderRequestDTO;
import com.eidko.order_service_wc.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper mapper =  new ModelMapper();
        mapper.typeMap(OrderRequestDTO.class, Order.class)
                .addMappings(x->x.skip(Order::setId));
        return mapper;
    }
}
