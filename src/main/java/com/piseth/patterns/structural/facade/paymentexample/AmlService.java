package com.piseth.patterns.structural.facade.paymentexample;

public class AmlService {
    public Boolean checkTransaction(String accountNumber, Double amount){
        IO.println("Checking AML for account number: " + accountNumber);
        return true;
    }
}
