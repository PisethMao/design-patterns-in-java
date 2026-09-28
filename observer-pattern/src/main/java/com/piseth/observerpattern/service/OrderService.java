package com.piseth.observerpattern.service;

import com.piseth.observerpattern.dto.CreateOrderRequest;
import com.piseth.observerpattern.dto.OrderResponse;

public interface OrderService {
    OrderResponse createOrder(
            CreateOrderRequest request
    );
}
