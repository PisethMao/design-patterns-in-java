package com.piseth.patterns.structural.proxy.retryproxy.paymentexample;

import java.math.BigDecimal;

public class RetryPaymentServiceProxy implements PaymentService {
    private final PaymentService target;
    private final int maxAttempts;
    private final long delayMillis;

    public RetryPaymentServiceProxy(
            PaymentService target,
            int maxAttempts,
            long delayMillis
    ) {
        this.target = target;
        this.maxAttempts = maxAttempts;
        this.delayMillis = delayMillis;
    }

    @Override
    public String processPayment(BigDecimal amount) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try {
                IO.println("[RETRY PROXY] Attempt " + attempt + "/" + maxAttempts);
                return target.processPayment(amount);
            } catch (PaymentServiceException e) {
                IO.println("[RETRY PROXY] Attempt " + attempt + " failed: " + e.getMessage());
                if (attempt == maxAttempts) {
                    IO.println("[RETRY PROXY] Maximum attempts reached");
                    throw e;
                }
                waitBeforeRetry();
            }
        }
        throw new IllegalStateException("Unexpected retry state");
    }

    private void waitBeforeRetry() {
        try {
            IO.println("[RETRY PROXY] Waiting " + delayMillis + " ms before retry...");
            Thread.sleep(delayMillis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Retry interrupted", e);
        }
    }
}
