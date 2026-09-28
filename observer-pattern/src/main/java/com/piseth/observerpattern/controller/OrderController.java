package com.piseth.observerpattern.controller;

import com.piseth.observerpattern.dto.CreateOrderRequest;
import com.piseth.observerpattern.dto.OrderResponse;
import com.piseth.observerpattern.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(
            OrderService orderService
    ) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(
            @Valid
            @RequestBody CreateOrderRequest request
    ) {
        OrderResponse response =
                orderService.createOrder(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}