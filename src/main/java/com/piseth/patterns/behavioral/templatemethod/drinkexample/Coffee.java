package com.piseth.patterns.behavioral.templatemethod.drinkexample;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        IO.println("Brewing coffee");
    }

    @Override
    protected void addCondiments() {
        IO.println("Adding sugar and milk");
    }
}
