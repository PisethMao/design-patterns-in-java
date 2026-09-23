package com.piseth.patterns.structural.composite.foodexample;

import java.math.BigDecimal;

public class MenuItem implements MenuComponent{
    private final String name;
    private final BigDecimal price;

    public MenuItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void display() {
        IO.println(name + " - $" + price);
    }
}
