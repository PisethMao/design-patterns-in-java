package com.piseth.statepattern.state;

import com.piseth.statepattern.domain.OrderStatus;
import org.springframework.stereotype.Component;

@Component
public class CancelledOrderState implements OrderState {
    @Override
    public OrderStatus status() {
        return OrderStatus.CANCELLED;
    }
}