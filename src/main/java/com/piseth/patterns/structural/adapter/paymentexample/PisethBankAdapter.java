package com.piseth.patterns.structural.adapter.paymentexample;

public class PisethBankAdapter implements PaymentProcessor {
    private final PisethBankService pisethBankService;

    public PisethBankAdapter(PisethBankService pisethBankService) {
        this.pisethBankService = pisethBankService;
    }

    @Override
    public void pay(Double amount) {
        pisethBankService.makePayment(amount, "USD");
        IO.println("Piseth Bank Payment processed successfully.");
    }
}
