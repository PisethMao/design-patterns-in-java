package com.piseth.patterns.behavioral.visitor.paymentexample;

public class AuditVisitor implements PaymentVisitor {
    @Override
    public void visit(CardPayment payment) {
        IO.println("[AUDIT] Card payment: " + payment.amount());
    }

    @Override
    public void visit(QrPayment payment) {
        IO.println("[AUDIT] QR payment: " + payment.amount());
    }

    @Override
    public void visit(BankTransfer payment) {
        IO.println("[AUDIT] Bank transfer: " + payment.amount());
    }
}
