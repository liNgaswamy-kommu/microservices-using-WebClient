package com.eidko.order_service_wc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceWcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceWcApplication.class, args);
		System.err.println("*** Welcome to order-service-wc ***");
	}

}
