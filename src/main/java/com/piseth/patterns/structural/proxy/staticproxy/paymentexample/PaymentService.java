package com.piseth.patterns.structural.proxy.staticproxy.paymentexample;

import java.math.BigDecimal;

public interface PaymentService {
    void pay(BigDecimal amount);
}
