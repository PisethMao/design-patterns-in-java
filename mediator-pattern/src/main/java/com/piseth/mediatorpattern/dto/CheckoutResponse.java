package com.piseth.mediatorpattern.dto;

public record CheckoutResponse(
        String orderId,
        String paymentId,
        String status,
        String message
) {
}