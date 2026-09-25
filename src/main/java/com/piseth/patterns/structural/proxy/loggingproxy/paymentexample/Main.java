package com.piseth.patterns.structural.proxy.loggingproxy.paymentexample;

import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.model.PaymentResult;
import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.proxy.LoggingPaymentServiceProxy;
import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.service.PaymentService;
import com.piseth.patterns.structural.proxy.loggingproxy.paymentexample.service.impl.PaymentServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main() {
        PaymentService paymentService =
                new PaymentServiceImpl();
        PaymentService loggingPaymentService =
                new LoggingPaymentServiceProxy(paymentService);
        PaymentResult result =
                loggingPaymentService.transfer(
                        "ACC001",
                        "ACC002",
                        new BigDecimal("100.00")
                );
        IO.println();
        IO.println("Client Receive: ");
        IO.println(result);
    }
}
