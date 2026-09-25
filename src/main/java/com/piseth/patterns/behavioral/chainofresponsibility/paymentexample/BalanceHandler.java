package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public class BalanceHandler extends TransactionHandler {
    @Override
    public void handle(TransactionRequest request) {
        IO.println("Checking balance...");
        if (request.getBalance() < request.getAmount()) {
            IO.println("Transaction rejected: insufficient balance.");
            return;
        }
        handleNext(request);
    }
}