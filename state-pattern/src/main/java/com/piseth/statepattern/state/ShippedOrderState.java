package com.piseth.statepattern.state;

import com.piseth.statepattern.context.OrderContext;
import com.piseth.statepattern.domain.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class ShippedOrderState implements OrderState {
    @Override
    public OrderStatus status() {
        return OrderStatus.SHIPPED;
    }

    @Override
    public void deliver(OrderContext context) {
        IO.println("[SHIPPED] Delivering order");
        context.transitionTo(OrderStatus.DELIVERED);
    }
}