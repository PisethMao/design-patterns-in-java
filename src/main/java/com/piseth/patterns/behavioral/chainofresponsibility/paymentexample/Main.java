package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public class Main {
    public static void main() {
        TransactionHandler authentication = new AuthenticationHandler();
        TransactionHandler accountStatus = new AccountStatusHandler();
        TransactionHandler balance = new BalanceHandler();
        TransactionHandler transactionLimit = new TransactionLimitHandler();
        authentication.setNext(accountStatus).setNext(balance).setNext(transactionLimit);
        TransactionRequest request = new TransactionRequest(
                        true,
                        true,
                        5000,
                        1000
                );
        authentication.handle(request);
    }
}
