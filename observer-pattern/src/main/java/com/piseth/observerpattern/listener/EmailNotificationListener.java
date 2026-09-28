package com.piseth.observerpattern.listener;

import com.piseth.observerpattern.event.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {
    @Async
    @EventListener
    public void handleOrderCreated(
            OrderCreatedEvent event
    ) {
        IO.println("[EMAIL] Sending order confirmation");
        IO.println("[EMAIL] To: " + event.customerEmail());
        IO.println("[EMAIL] Customer: " + event.customerName());
        IO.println("[EMAIL] Order ID: " + event.orderId());
        IO.println("[EMAIL] Total: $" + event.totalAmount());
        IO.println("[EMAIL] Confirmation sent");
    }
}