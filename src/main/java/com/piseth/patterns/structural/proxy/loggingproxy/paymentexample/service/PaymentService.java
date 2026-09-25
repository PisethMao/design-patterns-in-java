package com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.service;

import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.model.PaymentResult;

import java.math.BigDecimal;

public interface PaymentService {
    PaymentResult transfer(
            String fromAccount,
            String toAccount,
            BigDecimal amount
    );
}
