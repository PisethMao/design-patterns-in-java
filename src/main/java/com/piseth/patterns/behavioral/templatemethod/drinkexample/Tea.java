package com.piseth.patterns.behavioral.templatemethod.drinkexample;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        IO.println("Steeping tea");
    }

    @Override
    protected void addCondiments() {
        IO.println("Adding lemon");
    }
}
