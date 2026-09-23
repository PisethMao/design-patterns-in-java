package com.piseth.patterns.creational.factorymethod.paymentexample;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Double amount) {
        IO.println("Processing payment of CARD: " + amount);
    }
}
