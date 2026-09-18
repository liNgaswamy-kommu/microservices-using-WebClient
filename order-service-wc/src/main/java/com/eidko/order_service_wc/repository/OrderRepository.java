package com.eidko.order_service_wc.repository;

import com.eidko.order_service_wc.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
