package com.piseth.patterns.creational.prototype.paymentexample;

import java.math.BigDecimal;

public class Main {
    void main(){
        TransactionConfig config = new TransactionConfig("MOBILE", "KH", "USD", 30, 3);
        BankTransaction transaction = new BankTransaction("DEFAULT", "DEFAULT", "DEFAULT", BigDecimal.ZERO, config);
        BankTransaction transactionCopy = transaction.copy();
        transactionCopy.setTransactionId("TXN-10001");
        transactionCopy.setSenderAccount("ACC-001");
        transactionCopy.setReceiverAccount("ACC-002");
        transactionCopy.setAmount(new BigDecimal("150.00"));
        BankTransaction transactionCopy2 = transactionCopy.copy();
        transactionCopy.setTransactionId("TXN-10002");
        transactionCopy.setSenderAccount("ACC-003");
        transactionCopy.setReceiverAccount("ACC-004");
        transactionCopy.setAmount(new BigDecimal("250.00"));
        IO.println("Transaction");
        IO.println(transaction);
        IO.println();
        IO.println("Transaction Copy First");
        IO.println(transactionCopy);
        IO.println();
        IO.println("Transaction Copy Second");
        IO.println(transactionCopy2);
        IO.println();
    }
}
