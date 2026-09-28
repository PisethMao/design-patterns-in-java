package com.piseth.observerpattern.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record OrderResponse(
        UUID orderId,
        String customerName,
        String productName,
        int quantity,
        BigDecimal totalAmount,
        String status
) {
}