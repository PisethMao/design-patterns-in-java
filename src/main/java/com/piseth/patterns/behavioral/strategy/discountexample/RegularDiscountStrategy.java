package com.piseth.patterns.behavioral.strategy.discountexample;

public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}
