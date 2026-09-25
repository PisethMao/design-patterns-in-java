package com.piseth.patterns.structural.proxy.protectionproxy.paymentexample;

import java.math.BigDecimal;

public class TransferServiceProxy implements TransferService {
    private final TransferService transferService;

    public TransferServiceProxy() {
        this.transferService = new CoreBankingTransferService();
    }

    private void validateAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

    private void checkPermission(){
        IO.println("Checking Permission...");
        IO.println("Permission Granted");
    }

    private void logTransaction(String fromAccount, String toAccount, BigDecimal amount){
        IO.println("Logging Transaction...");
        IO.println("Transaction Logged");
    }

    @Override
    public void transfer(String fromAccount, String toAccount, BigDecimal amount) {
        validateAmount(amount);
        checkPermission();
        logTransaction(fromAccount, toAccount, amount);
        transferService.transfer(fromAccount, toAccount, amount);
    }
}
