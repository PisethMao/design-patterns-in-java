package com.piseth.patterns.structural.proxy.protectionproxy.paymentexample;

import java.math.BigDecimal;

public class CoreBankingTransferService implements TransferService {
    @Override
    public void transfer(String fromAccount, String toAccount, BigDecimal amount) {
        IO.println("Sending Transaction To Core Banking...");
        IO.println("Transaction Completed With Amount: " + amount);
    }
}
