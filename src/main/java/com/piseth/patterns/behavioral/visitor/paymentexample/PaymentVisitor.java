package com.piseth.patterns.behavioral.visitor.paymentexample;

public interface PaymentVisitor {
    void visit(CardPayment payment);

    void visit(QrPayment payment);

    void visit(BankTransfer payment);
}
