package com.piseth.patterns.structural.proxy.smartproxy.paymentexample.service;

public class RealBankAccountService
        implements BankAccountService {
    @Override
    public void withdraw(
            String accountNumber,
            double amount
    ) {
        IO.println(
                "[REAL SERVICE] Processing withdrawal..."
        );
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        IO.println(
                "[REAL SERVICE] Withdrawn $" +
                        amount +
                        " from account " +
                        accountNumber
        );
    }
}
