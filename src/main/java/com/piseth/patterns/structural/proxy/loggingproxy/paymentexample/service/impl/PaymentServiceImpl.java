package com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.service.impl;

import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.model.PaymentResult;
import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.service.PaymentService;

import java.math.BigDecimal;
import java.util.UUID;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentResult transfer(
            String fromAccount,
            String toAccount,
            BigDecimal amount
    ) {
        simulateProcessing();
        return new PaymentResult(
                UUID.randomUUID().toString(),
                fromAccount,
                toAccount,
                amount,
                "SUCCESS"
        );
    }

    private void simulateProcessing() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(
                    "Payment processing interrupted",
                    e
            );
        }
    }
}
