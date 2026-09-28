package com.piseth.patterns.behavioral.state.orderexample;

public class PaidOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Order is already paid.");
    }

    @Override
    public void ship(Order order) {
        IO.println("Order shipped.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliver(Order order) {
        throw new IllegalStateException("Order must be shipped first.");
    }

    @Override
    public void cancel(Order order) {
        IO.println("Refunding payment...");
        IO.println("Order cancelled.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getName() {
        return "PAID";
    }
}
