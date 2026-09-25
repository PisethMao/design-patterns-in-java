package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public class AuthenticationHandler extends TransactionHandler {
    @Override
    public void handle(TransactionRequest request) {
        IO.println("Checking authentication...");
        if (!request.isAuthenticated()) {
            IO.println("Transaction rejected: user is not authenticated.");
            return;
        }
        handleNext(request);
    }
}
