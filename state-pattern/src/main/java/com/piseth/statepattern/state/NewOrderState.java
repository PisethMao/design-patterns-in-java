package com.piseth.statepattern.state;

import com.piseth.statepattern.context.OrderContext;
import com.piseth.statepattern.domain.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class NewOrderState implements OrderState {
    @Override
    public OrderStatus status() {
        return OrderStatus.NEW;
    }

    @Override
    public void pay(
            OrderContext context
    ) {
        IO.println("[NEW] Paying order");
        context.transitionTo(OrderStatus.PAID);
    }

    @Override
    public void cancel(
            OrderContext context
    ) {
        IO.println("[NEW] Cancelling order");
        context.transitionTo(OrderStatus.CANCELLED);
    }
}