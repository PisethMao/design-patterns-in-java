package com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.proxy;

import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.model.PaymentResult;
import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.service.PaymentService;

import java.math.BigDecimal;

public class LoggingPaymentServiceProxy implements PaymentService {
    private final PaymentService target;

    public LoggingPaymentServiceProxy(PaymentService target) {
        this.target = target;
    }

    @Override
    public PaymentResult transfer(
            String fromAccount,
            String toAccount,
            BigDecimal amount
    ) {
        IO.println("========== PAYMENT LOG ==========");
        IO.println("[LOG] Transfer requested");
        IO.println("[LOG] From account: " + fromAccount);
        IO.println("[LOG] To account: " + toAccount);
        IO.println("[LOG] Amount: " + amount);
        long startTime = System.currentTimeMillis();
        PaymentResult result =
                target.transfer(
                        fromAccount,
                        toAccount,
                        amount
                );
        long endTime = System.currentTimeMillis();
        IO.println("[LOG] Transaction ID: " + result.transactionId());
        IO.println("[LOG] Status: " + result.status());
        IO.println("[LOG] Execution time: " + (endTime - startTime) + " ms");
        IO.println("=================================");
        return result;
    }
}
