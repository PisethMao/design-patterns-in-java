package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public abstract class TransactionHandler {
    protected TransactionHandler nextHandler;

    public TransactionHandler setNext(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handle(TransactionRequest request);

    protected void handleNext(TransactionRequest request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
