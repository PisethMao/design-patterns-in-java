package com.piseth.patterns.structural.proxy.staticproxy.paymentexample;

import java.math.BigDecimal;

public class PaymentServiceProxy implements PaymentService {
    private final PaymentService paymentService;

    public PaymentServiceProxy(
            PaymentService paymentService
    ) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay(BigDecimal amount) {
        IO.println("[PROXY] Payment request received.");
        paymentService.pay(amount);
        IO.println("[PROXY] Payment request finished.");
    }
}
