package com.piseth.patterns.structural.adapter.paymentexample;

public class PisethBankService {
    public void makePayment(Double amount, String currency) {
        IO.println("Processing Piseth Bank Payment...");
        IO.println("Amount: " + amount);
        IO.println("Currency: " + currency);
    }
}
