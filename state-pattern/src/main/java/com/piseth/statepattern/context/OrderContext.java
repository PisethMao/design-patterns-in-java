package com.piseth.statepattern.context;

import com.piseth.statepattern.domain.Order;
import com.piseth.statepattern.domain.OrderStatus;
import com.piseth.statepattern.state.OrderState;
import com.piseth.statepattern.state.OrderStateFactory;

public class OrderContext {
    private final Order order;
    private final OrderStateFactory stateFactory;

    private OrderState currentState;

    public OrderContext(Order order, OrderStateFactory stateFactory) {
        this.order = order;
        this.stateFactory = stateFactory;
        this.currentState = stateFactory.getState(order.getStatus());
    }

    public void pay() {
        currentState.pay(this);
    }

    public void ship() {
        currentState.ship(this);
    }

    public void deliver() {
        currentState.deliver(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void transitionTo(
            OrderStatus newStatus
    ) {
        IO.println(
                "[STATE] "
                        + order.getStatus()
                        + " -> "
                        + newStatus
        );
        order.transitionTo(newStatus);
        currentState = stateFactory.getState(newStatus);
    }

    public OrderStatus currentStatus() {
        return order.getStatus();
    }
}