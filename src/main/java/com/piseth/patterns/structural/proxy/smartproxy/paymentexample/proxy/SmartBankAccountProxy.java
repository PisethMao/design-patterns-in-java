package com.piseth.patterns.structural.proxy.smartproxy.paymentexample.proxy;

import com.piseth.patterns.structural.proxy.smartproxy.paymentexample.service.BankAccountService;
import com.piseth.patterns.structural.proxy.smartproxy.paymentexample.service.RealBankAccountService;

public class SmartBankAccountProxy
        implements BankAccountService {
    private final BankAccountService realService;
    private int requestCount = 0;

    public SmartBankAccountProxy(BankAccountService bankAccountService) {
        this.realService = bankAccountService;
    }

    @Override
    public void withdraw(
            String accountNumber,
            double amount
    ) {
        IO.println(
                "[SMART PROXY] Request received"
        );
        validate(accountNumber, amount);
        checkPermission();
        requestCount++;
        IO.println(
                "[SMART PROXY] Request count: "
                        + requestCount
        );
        long startTime =
                System.nanoTime();
        realService.withdraw(
                accountNumber,
                amount
        );
        long endTime =
                System.nanoTime();
        double durationMs =
                (endTime - startTime)
                        / 1_000_000.0;
        IO.println(
                "[SMART PROXY] Execution time: "
                        + durationMs
                        + " ms"
        );
        IO.println(
                "[SMART PROXY] Request completed"
        );
    }

    private void validate(
            String accountNumber,
            double amount
    ) {
        if (accountNumber == null ||
                accountNumber.isBlank()) {
            IO.println(
                    "[SMART PROXY] Validation failed"
            );
            throw new IllegalArgumentException(
                    "Account number cannot be empty"
            );
        }
        if (amount <= 0) {
            IO.println(
                    "[SMART PROXY] Validation failed"
            );
            throw new IllegalArgumentException(
                    "Amount must be greater than 0"
            );
        }
        IO.println(
                "[SMART PROXY] Validation passed"
        );
    }

    private void checkPermission() {
        IO.println(
                "[SMART PROXY] Permission granted"
        );
    }
}
