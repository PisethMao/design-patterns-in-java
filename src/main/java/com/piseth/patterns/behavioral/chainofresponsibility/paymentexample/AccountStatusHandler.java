package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public class AccountStatusHandler extends TransactionHandler {
    @Override
    public void handle(TransactionRequest request) {
        IO.println("Checking account status...");
        if (!request.isAccountActive()) {
            IO.println("Transaction rejected: account is inactive.");
            return;
        }
        handleNext(request);
    }
}
