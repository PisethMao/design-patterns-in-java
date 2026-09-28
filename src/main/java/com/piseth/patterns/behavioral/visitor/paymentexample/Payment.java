package com.piseth.patterns.behavioral.visitor.paymentexample;

public interface Payment {
    void accept(PaymentVisitor visitor);
}
