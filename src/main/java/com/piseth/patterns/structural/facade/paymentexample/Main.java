package com.piseth.patterns.structural.facade.paymentexample;

public class Main {
    public static void main() {
        BankingFacade bankingFacade = new BankingFacade();
        bankingFacade.transferMoney("001001", "002002", 200.0);
    }
}
