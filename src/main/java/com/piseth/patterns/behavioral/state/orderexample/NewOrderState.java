package com.piseth.patterns.behavioral.state.orderexample;

public class NewOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        IO.println("Payment successful.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void ship(Order order) {
        throw new IllegalStateException("Cannot ship an unpaid order.");
    }

    @Override
    public void deliver(Order order) {
        throw new IllegalStateException("Cannot deliver a new order.");
    }

    @Override
    public void cancel(Order order) {
        IO.println("Order cancelled.");
        order.setState(new CancelledOrderState());
    }

    @Override
    public String getName() {
        return "NEW";
    }
}
