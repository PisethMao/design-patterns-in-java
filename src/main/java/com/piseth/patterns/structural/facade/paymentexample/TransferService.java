package com.piseth.patterns.structural.facade.paymentexample;

public class TransferService {
    public void transfer(String sourceAccountNumber, String destinationAccountNumber, Double amount){
        IO.println("Transferring $" + amount + " from " + sourceAccountNumber + " to " + destinationAccountNumber);
    }
}
