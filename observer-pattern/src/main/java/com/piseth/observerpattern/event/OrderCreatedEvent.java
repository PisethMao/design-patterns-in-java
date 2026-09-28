package com.piseth.observerpattern.event;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record OrderCreatedEvent(
        UUID orderId,
        String customerName,
        String customerEmail,
        String productName,
        int quantity,
        BigDecimal totalAmount,
        Instant createdAt
) {
}