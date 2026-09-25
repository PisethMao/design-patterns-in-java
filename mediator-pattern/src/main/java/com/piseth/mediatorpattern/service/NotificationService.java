package com.piseth.mediatorpattern.service;

public interface NotificationService {
    void sendOrderConfirmation(
            String email,
            String orderId,
            String paymentId
    );
}
