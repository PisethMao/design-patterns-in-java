package com.piseth.patterns.structural.proxy.retryproxy.paymentexample;

import java.math.BigDecimal;

public interface PaymentService {
    String processPayment(BigDecimal amount);
}
