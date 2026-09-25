package com.piseth.patterns.structural.facade.paymentexample;

public class BalanceService {
    public Boolean hasEnoughBalance(String accountNumber, Double amount){
        IO.println("Checking balance for account number: " + accountNumber);
        return true;
    }
}
