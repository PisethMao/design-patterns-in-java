package com.piseth.patterns.structural.decorator.coffeeexample;

import java.math.BigDecimal;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("0.25"));
    }
}
