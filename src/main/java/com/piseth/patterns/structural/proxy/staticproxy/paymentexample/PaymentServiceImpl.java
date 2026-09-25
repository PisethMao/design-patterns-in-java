package com.piseth.patterns.structural.proxy.staticproxy.paymentexample;

import java.math.BigDecimal;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay(BigDecimal amount) {
        IO.println("Processing payment: $" + amount);
        IO.println("Payment completed successfully.");
    }
}
