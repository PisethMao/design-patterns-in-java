package com.piseth.patterns.creational.factorymethod.paymentexample;

public abstract class PaymentService {
    public abstract PaymentProcessor createPaymentProcessor();

    public void processPayment(Double amount) {
        PaymentProcessor processor = createPaymentProcessor();
        IO.println("Validating Payment");
        processor.processPayment(amount);
        IO.println("Recording Transaction");
    }
}
