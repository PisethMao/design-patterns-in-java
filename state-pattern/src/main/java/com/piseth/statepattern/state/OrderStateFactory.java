package com.piseth.statepattern.state;

import com.piseth.statepattern.domain.OrderStatus;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
public class OrderStateFactory {
    private final Map<OrderStatus, OrderState> states;

    public OrderStateFactory(List<OrderState> orderStates) {
        this.states = new EnumMap<>(OrderStatus.class);
        for (OrderState state : orderStates) {
            states.put(state.status(), state);
        }
    }

    public OrderState getState(OrderStatus status) {
        OrderState state = states.get(status);
        if (state == null) {
            throw new IllegalStateException("No state registered for: " + status);
        }
        return state;
    }
}