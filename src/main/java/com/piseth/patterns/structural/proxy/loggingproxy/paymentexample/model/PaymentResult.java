package com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.model;

import java.math.BigDecimal;

public record PaymentResult(
        String transactionId,
        String fromAccount,
        String toAccount,
        BigDecimal amount,
        String status
) {
}
