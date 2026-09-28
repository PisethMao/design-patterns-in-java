package com.piseth.patterns.behavioral.templatemethod.paymentexample.processor;

public class QrPaymentProcessor extends PaymentProcessor {

    @Override
    protected void authenticate() {
        IO.println("Authenticating QR payment");
    }

    @Override
    protected void executePayment() {
        IO.println("Executing QR transfer");
    }
}
