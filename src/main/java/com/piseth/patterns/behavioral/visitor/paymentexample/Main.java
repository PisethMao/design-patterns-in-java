package com.piseth.patterns.behavioral.visitor.paymentexample;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main() {
        List<Payment> payments = List.of(
                new CardPayment(new BigDecimal("100")),
                new QrPayment(new BigDecimal("200")),
                new BankTransfer(new BigDecimal("500")));
        PaymentVisitor feeVisitor = new FeeVisitor();
        for (Payment payment : payments) {
            payment.accept(feeVisitor);
        }
    }
}
