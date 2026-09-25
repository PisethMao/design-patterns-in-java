package com.piseth.mediatorpattern.service.impl;

import com.piseth.mediatorpattern.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public void sendOrderConfirmation(
            String email,
            String orderId,
            String paymentId
    ) {
        IO.println("[NOTIFICATION] Sending confirmation");
        IO.println("[NOTIFICATION] Email: " + email);
        IO.println("[NOTIFICATION] Order ID: " + orderId);
        IO.println("[NOTIFICATION] Payment ID: " + paymentId);
        IO.println("[NOTIFICATION] Confirmation sent");
    }
}
