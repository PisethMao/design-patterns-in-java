package com.piseth.patterns.creational.factorymethod.paymentexample;

public class KhqrPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Double amount) {
        IO.println("Processing payment of KHQR: " + amount);
    }
}
