package com.piseth.patterns.structural.facade.paymentexample;

public class AccountService {
    public Boolean validateAccount(String accountNumber){
        IO.println("Validating account number: " + accountNumber);
        return true;
    }
}
