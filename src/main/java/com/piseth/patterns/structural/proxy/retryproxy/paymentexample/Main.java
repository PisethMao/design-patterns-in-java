package com.piseth.patterns.structural.proxy.retryproxy.paymentexample;

import java.math.BigDecimal;

public class Main {
    public static void main() {
        PaymentService realService = new RealPaymentService();
        PaymentService paymentService =
                new RetryPaymentServiceProxy(
                        realService,
                        3,
                        1000
                );
        try {
            String result = paymentService.processPayment(BigDecimal.valueOf(100.00));
            IO.println();
            IO.println("Result: " + result);
        } catch (PaymentServiceException e) {
            IO.println();
            IO.println("Payment ultimately failed: " + e.getMessage());
        }
    }
}
