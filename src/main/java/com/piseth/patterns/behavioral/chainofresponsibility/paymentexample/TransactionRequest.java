package com.piseth.patterns.behavioral.chainofresponsibility.paymentexample;

public class TransactionRequest {
    private final boolean authenticated;
    private final boolean accountActive;
    private final double balance;
    private final double amount;

    public TransactionRequest(
            boolean authenticated,
            boolean accountActive,
            double balance,
            double amount
    ) {
        this.authenticated = authenticated;
        this.accountActive = accountActive;
        this.balance = balance;
        this.amount = amount;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public boolean isAccountActive() {
        return accountActive;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
