package com.piseth.patterns.behavioral.state.orderexample;

public class CancelledOrderState implements OrderState {
    @Override
    public void pay(Order order) {
        throw invalid();
    }

    @Override
    public void ship(Order order) {
        throw invalid();
    }

    @Override
    public void deliver(Order order) {
        throw invalid();
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException("Order is already cancelled.");
    }

    @Override
    public String getName() {
        return "CANCELLED";
    }

    private IllegalStateException invalid() {
        return new IllegalStateException("Cancelled order cannot be modified.");
    }
}
