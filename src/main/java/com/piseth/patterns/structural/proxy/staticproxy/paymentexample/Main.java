package com.piseth.patterns.structural.proxy.staticproxy.paymentexample;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentService realService =
                new PaymentServiceImpl();
        PaymentService proxy =
                new PaymentServiceProxy(realService);
        proxy.pay(BigDecimal.valueOf(100));
    }
}
