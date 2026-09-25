package com.piseth.patterns.structural.facade.paymentexample;

public class TransactionService {
    public void saveTransaction(){
        IO.println("Saving transaction...");
        IO.println("Transaction saved successfully.");
    }
}
