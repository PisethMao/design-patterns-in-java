package com.piseth.patterns.behavioral.state.orderexample;

public class DeliveredOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Order is already completed.");
    }

    @Override
    public void ship(Order order) {
        throw new IllegalStateException("Order has already been shipped.");
    }

    @Override
    public void deliver(Order order) {
        throw new IllegalStateException("Order is already delivered.");
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException("Delivered order cannot be cancelled.");
    }

    @Override
    public String getName() {
        return "DELIVERED";
    }
}
