package com.piseth.statepattern.dto;

import com.piseth.statepattern.domain.Order;
import com.piseth.statepattern.domain.OrderStatus;

import java.util.UUID;

public record OrderResponse(
        UUID id,
        String productName,
        int quantity,
        OrderStatus status

) {
    public static OrderResponse from(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getProductName(),
                order.getQuantity(),
                order.getStatus()
        );
    }
}