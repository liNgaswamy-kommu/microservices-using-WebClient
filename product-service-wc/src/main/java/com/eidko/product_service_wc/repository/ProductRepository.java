package com.eidko.product_service_wc.repository;

import com.eidko.product_service_wc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
