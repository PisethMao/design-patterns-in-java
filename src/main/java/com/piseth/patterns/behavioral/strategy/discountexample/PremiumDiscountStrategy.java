package com.piseth.patterns.behavioral.strategy.discountexample;

public class PremiumDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
