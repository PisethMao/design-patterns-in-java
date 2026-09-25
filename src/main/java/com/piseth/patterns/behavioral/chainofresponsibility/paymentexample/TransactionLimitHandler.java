package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public class TransactionLimitHandler extends TransactionHandler {
    private static final double MAX_TRANSACTION = 10_000;

    @Override
    public void handle(TransactionRequest request) {
        IO.println("Checking transaction limit...");
        if (request.getAmount() > MAX_TRANSACTION) {
            IO.println("Transaction rejected: transaction limit exceeded.");
            return;
        }
        IO.println("Transaction approved.");
        handleNext(request);
    }
}
