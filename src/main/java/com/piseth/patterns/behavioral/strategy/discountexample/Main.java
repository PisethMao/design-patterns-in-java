package com.piseth.patterns.behavioral.strategy.discountexample;

public class Main {
    public static void main() {
        DiscountStrategy strategy = new VipDiscountStrategy();
        DiscountContext context = new DiscountContext(strategy);
        double discount = context.calculate(100);
        IO.println(discount);
    }
}
