package com.piseth.patterns.behavioral.state.orderexample;

public class ShippedOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Order is already paid.");
    }

    @Override
    public void ship(Order order) {
        throw new IllegalStateException("Order is already shipped.");
    }

    @Override
    public void deliver(Order order) {
        IO.println("Order delivered.");
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException("Cannot cancel a shipped order.");
    }

    @Override
    public String getName() {
        return "SHIPPED";
    }
}
