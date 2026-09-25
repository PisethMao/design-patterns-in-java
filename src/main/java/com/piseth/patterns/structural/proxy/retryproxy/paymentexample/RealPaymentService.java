package com.piseth.patterns.structural.proxy.retryproxy.paymentexample;

import java.math.BigDecimal;
import java.util.Random;

public class RealPaymentService implements PaymentService {
    private final Random random = new Random();

    @Override
    public String processPayment(BigDecimal amount) {
        IO.println("[REAL SERVICE] Processing payment: $" + amount);
        int number = random.nextInt(100);
        if (number < 70) {
            IO.println("[REAL SERVICE] Temporary network failure");
            throw new PaymentServiceException("Payment gateway temporarily unavailable");
        }
        IO.println("[REAL SERVICE] Payment successful");
        return "Payment completed: $" + amount;
    }
}
