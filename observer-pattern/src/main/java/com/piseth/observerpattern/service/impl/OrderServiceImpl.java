package com.piseth.observerpattern.service.impl;

import com.piseth.observerpattern.dto.CreateOrderRequest;
import com.piseth.observerpattern.dto.OrderResponse;
import com.piseth.observerpattern.event.OrderCreatedEvent;
import com.piseth.observerpattern.service.OrderService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {
    private final ApplicationEventPublisher eventPublisher;

    public OrderServiceImpl(
            ApplicationEventPublisher eventPublisher
    ) {
        this.eventPublisher = eventPublisher;
    }

    @Override
    public OrderResponse createOrder(
            CreateOrderRequest request
    ) {
        UUID orderId = UUID.randomUUID();
        BigDecimal totalAmount =
                request.unitPrice()
                        .multiply(
                                BigDecimal.valueOf(
                                        request.quantity()
                                )
                        );
        IO.println("[ORDER] Creating order: " + orderId);
        OrderCreatedEvent event =
                new OrderCreatedEvent(
                        orderId,
                        request.customerName(),
                        request.customerEmail(),
                        request.productName(),
                        request.quantity(),
                        totalAmount,
                        Instant.now()
                );
        eventPublisher.publishEvent(event);
        return new OrderResponse(
                orderId,
                request.customerName(),
                request.productName(),
                request.quantity(),
                totalAmount,
                "CREATED"
        );
    }
}