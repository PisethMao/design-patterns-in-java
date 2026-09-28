package com.piseth.patterns.behavioral.templatemethod.paymentexample;

import com.piseth.patterns.behavioral.templatemethod.paymentexample.processor.CreditCardPaymentProcessor;
import com.piseth.patterns.behavioral.templatemethod.paymentexample.processor.PaymentProcessor;
import com.piseth.patterns.behavioral.templatemethod.paymentexample.processor.QrPaymentProcessor;

public class Main {
    public static void main() {
        PaymentProcessor creditCard = new CreditCardPaymentProcessor();
        creditCard.processPayment();
        IO.println();
        PaymentProcessor qr = new QrPaymentProcessor();
        qr.processPayment();
    }
}
