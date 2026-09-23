package com.piseth.patterns.creational.factorymethod.paymentexample;

public class KhqrPaymentService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new KhqrPaymentProcessor();
    }
}
