package com.piseth.observerpattern.listener;

import com.piseth.observerpattern.event.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryListener {
    @EventListener
    public void handleOrderCreated(
            OrderCreatedEvent event
    ) {
        IO.println("[INVENTORY] Updating inventory");
        IO.println("[INVENTORY] Product: " + event.productName());
        IO.println("[INVENTORY] Quantity sold: " + event.quantity());
        IO.println("[INVENTORY] Inventory updated");
    }
}