package com.piseth.patterns.behavioral.strategy.discountexample;

public class DiscountContext {
    private DiscountStrategy strategy;

    public DiscountContext(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double amount) {
        return strategy.calculateDiscount(amount);
    }
}
