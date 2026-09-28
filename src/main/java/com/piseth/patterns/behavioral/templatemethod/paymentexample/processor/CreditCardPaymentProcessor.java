package com.piseth.patterns.behavioral.templatemethod.paymentexample.processor;

public class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    protected void authenticate() {
        IO.println("Authenticating credit card");
    }

    @Override
    protected void executePayment() {
        IO.println("Charging credit card");
    }
}
