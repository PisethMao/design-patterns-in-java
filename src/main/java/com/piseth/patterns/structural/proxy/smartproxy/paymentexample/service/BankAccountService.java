package com.piseth.patterns.structural.proxy.smartproxy.paymentexample.service;

public interface BankAccountService {
    void withdraw(
            String accountNumber,
            double amount
    );
}
