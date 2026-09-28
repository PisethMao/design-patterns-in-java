package com.piseth.patterns.behavioral.templatemethod.drinkexample;

public abstract class Beverage {
    public final void prepare() {
        boilWater();
        brew();
        pourIntoCup();
        addCondiments();
    }

    private void boilWater() {
        IO.println("Boiling water");
    }

    protected abstract void brew();

    private void pourIntoCup() {
        IO.println("Pouring into cup");
    }

    protected abstract void addCondiments();
}