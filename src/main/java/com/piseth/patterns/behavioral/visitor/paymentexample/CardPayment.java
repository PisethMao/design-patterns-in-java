package com.piseth.patterns.behavioral.visitor.paymentexample;

import java.math.BigDecimal;

public record CardPayment(BigDecimal amount) implements Payment {
    @Override
    public void accept(PaymentVisitor visitor) {
        visitor.visit(this);
    }
}
