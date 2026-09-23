package com.piseth.patterns.creational.prototype.paymentexample;

import java.math.BigDecimal;

public class BankTransaction implements Prototype<BankTransaction> {
    private String transactionId;

    private String senderAccount;

    private String receiverAccount;

    private BigDecimal amount;

    private TransactionConfig config;

    public BankTransaction(String transactionId, String senderAccount, String receiverAccount, BigDecimal amount, TransactionConfig config) {
        this.transactionId = transactionId;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.config = config;
    }


    @Override
    public BankTransaction copy() {
        TransactionConfig configCopy = new TransactionConfig(this.config);
        return new BankTransaction(this.transactionId, this.senderAccount, this.receiverAccount, this.amount, configCopy);
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionConfig getConfig() {
        return config;
    }

    public void setConfig(TransactionConfig config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", senderAccount='" + senderAccount + '\'' +
                ", receiverAccount='" + receiverAccount + '\'' +
                ", amount=" + amount +
                ", config=" + config +
                '}';
    }
}
