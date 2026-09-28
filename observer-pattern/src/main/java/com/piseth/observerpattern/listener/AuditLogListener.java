package com.piseth.observerpattern.listener;

import com.piseth.observerpattern.event.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AuditLogListener {
    @EventListener
    public void handleOrderCreated(
            OrderCreatedEvent event
    ) {
        IO.println("[AUDIT] ORDER_CREATED");
        IO.println("[AUDIT] Order ID: " + event.orderId());
        IO.println("[AUDIT] Customer: " + event.customerName());
        IO.println("[AUDIT] Time: " + event.createdAt());
    }
}
