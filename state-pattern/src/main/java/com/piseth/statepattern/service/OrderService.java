package com.piseth.statepattern.service;

import com.piseth.statepattern.dto.CreateOrderRequest;
import com.piseth.statepattern.dto.OrderResponse;

import java.util.UUID;

public interface OrderService {
    OrderResponse create(CreateOrderRequest request);

    OrderResponse findById(UUID id);

    OrderResponse pay(UUID id);

    OrderResponse ship(UUID id);

    OrderResponse deliver(UUID id);

    OrderResponse cancel(UUID id);
}