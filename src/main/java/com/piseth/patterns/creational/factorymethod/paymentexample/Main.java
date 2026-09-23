package com.piseth.patterns.creational.factorymethod.paymentexample;

public class Main {
    void main() {
        PaymentService khqrPaymentService = new KhqrPaymentService();
        PaymentService cardPaymentService = new CardPaymentService();
        khqrPaymentService.processPayment(100.0);
        cardPaymentService.processPayment(200.0);
    }
}
