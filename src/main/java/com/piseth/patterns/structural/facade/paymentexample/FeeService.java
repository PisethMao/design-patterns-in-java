package com.piseth.patterns.structural.facade.paymentexample;

public class FeeService {
    public Double calculateFee(Double amount){
        Double fee = amount * 0.05;
        IO.println("Fee: $" + fee);
        return fee;
    }
}
