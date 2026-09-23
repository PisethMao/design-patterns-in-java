package com.piseth.patterns.structural.decorator.coffeeexample;

import java.math.BigDecimal;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal("2.00");
    }
}
