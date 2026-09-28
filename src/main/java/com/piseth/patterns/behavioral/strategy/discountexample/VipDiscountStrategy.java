package com.piseth.patterns.behavioral.strategy.discountexample;

public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}