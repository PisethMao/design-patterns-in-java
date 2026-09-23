package com.piseth.patterns.structural.adapter.paymentexample;

public class Main {
    static void main() {
        PisethBankService pisethBankService = new PisethBankService();
        PisethBankAdapter pisethBankAdapter = new PisethBankAdapter(pisethBankService);
        pisethBankAdapter.pay(100.0);
    }
}
