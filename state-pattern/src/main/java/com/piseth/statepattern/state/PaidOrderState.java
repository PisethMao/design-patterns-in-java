package com.piseth.statepattern.state;

import com.piseth.statepattern.context.OrderContext;
import com.piseth.statepattern.domain.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class PaidOrderState implements OrderState {
    @Override
    public OrderStatus status() {
        return OrderStatus.PAID;
    }

    @Override
    public void ship(OrderContext context) {
        IO.println("[PAID] Shipping order");
        context.transitionTo(OrderStatus.SHIPPED);
    }
}