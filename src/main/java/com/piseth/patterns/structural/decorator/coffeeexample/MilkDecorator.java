package com.piseth.patterns.structural.decorator.coffeeexample;

import java.math.BigDecimal;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("0.50"));
    }
}
