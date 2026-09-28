package com.piseth.patterns.behavioral.templatemethod.drinkexample;

public class Main {
    public static void main() {
        Beverage coffee = new Coffee();
        coffee.prepare();
        IO.println();
        Beverage tea = new Tea();
        tea.prepare();
    }
}
