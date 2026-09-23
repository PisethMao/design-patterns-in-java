package com.piseth.patterns.creational.factorymethod.paymentexample;

public class CardPaymentService extends PaymentService {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CardPaymentProcessor();
    }
}
