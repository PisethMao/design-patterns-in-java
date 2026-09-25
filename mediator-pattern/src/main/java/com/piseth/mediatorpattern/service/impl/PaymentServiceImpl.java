package com.piseth.mediatorpattern.service.impl;

import com.piseth.mediatorpattern.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String processPayment(
            BigDecimal amount
    ) {
        IO.println("[PAYMENT] Processing payment: $" + amount);
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Payment amount must be greater than zero"
            );
        }
        String paymentId =
                "PAY-"
                        + UUID.randomUUID()
                        .toString()
                        .substring(0, 8)
                        .toUpperCase();
        IO.println("[PAYMENT] Payment completed: " + paymentId);
        return paymentId;
    }
}
