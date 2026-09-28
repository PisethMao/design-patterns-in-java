package com.piseth.patterns.behavioral.visitor.paymentexample;

import java.math.BigDecimal;

public class FeeVisitor implements PaymentVisitor {
    @Override
    public void visit(CardPayment payment) {
        BigDecimal fee = payment.amount().multiply(new BigDecimal("0.02"));
        IO.println("Card fee: " + fee);
    }

    @Override
    public void visit(QrPayment payment) {
        BigDecimal fee = payment.amount().multiply(new BigDecimal("0.005"));
        IO.println("QR fee: " + fee);
    }

    @Override
    public void visit(BankTransfer payment) {
        BigDecimal fee = payment.amount().multiply(new BigDecimal("0.01"));
        IO.println("Bank transfer fee: " + fee);
    }
}
