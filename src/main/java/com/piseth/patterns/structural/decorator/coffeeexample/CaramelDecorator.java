package com.piseth.patterns.structural.decorator.coffeeexample;

import java.math.BigDecimal;

public class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("0.75"));
    }
}
