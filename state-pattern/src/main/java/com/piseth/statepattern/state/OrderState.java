package com.piseth.statepattern.state;

import com.piseth.statepattern.context.OrderContext;
import com.piseth.statepattern.domain.OrderStatus;
import com.piseth.statepattern.exception.InvalidStateTransitionException;

public interface OrderState {
    OrderStatus status();

    default void pay(OrderContext context) {
        throw invalidAction("PAY", context);
    }

    default void ship(OrderContext context) {
        throw invalidAction("SHIP", context);
    }

    default void deliver(OrderContext context) {
        throw invalidAction("DELIVER", context);
    }

    default void cancel(OrderContext context) {
        throw invalidAction("CANCEL", context);
    }

    private InvalidStateTransitionException invalidAction(
            String action,
            OrderContext context
    ) {
        return new InvalidStateTransitionException(
                "Cannot "
                        + action
                        + " order while order is "
                        + context.currentStatus()
        );
    }
}