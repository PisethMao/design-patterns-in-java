package com.piseth.statepattern.domain;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Order {
    private final UUID id;
    private final String productName;
    private final int quantity;

    private OrderStatus status;

    public Order(
            UUID id,
            String productName,
            int quantity
    ) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.status = OrderStatus.NEW;
    }

    public void transitionTo(OrderStatus newStatus) {
        this.status = newStatus;
    }
}