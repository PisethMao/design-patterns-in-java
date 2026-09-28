package com.piseth.statepattern.state;

import com.piseth.statepattern.domain.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class DeliveredOrderState implements OrderState {
    @Override
    public OrderStatus status() {
        return OrderStatus.DELIVERED;
    }
}