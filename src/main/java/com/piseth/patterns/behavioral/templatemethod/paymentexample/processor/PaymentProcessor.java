package com.piseth.patterns.behavioral.templatemethod.paymentexample.processor;

public abstract class PaymentProcessor {
    public final void processPayment() {
        validate();
        authenticate();
        calculateFee();
        executePayment();
        saveTransaction();
        sendNotification();
    }

    protected void validate() {
        IO.println("Validating payment");
    }

    protected abstract void authenticate();

    protected void calculateFee() {
        IO.println("Calculating fee");
    }

    protected abstract void executePayment();

    protected void saveTransaction() {
        IO.println("Saving transaction");
    }

    protected void sendNotification() {
        IO.println("Sending notification");
    }
}
