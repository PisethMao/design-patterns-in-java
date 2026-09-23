package com.piseth.patterns.structural.decorator.coffeeexample;

public class Main {
    public static void main() {
        Coffee coffee = new SimpleCoffee();
        IO.println(coffee.getDescription());
        IO.println(coffee.getCost());

        coffee = new MilkDecorator(coffee);
        IO.println(coffee.getDescription());
        IO.println(coffee.getCost());
        
        coffee = new SugarDecorator(coffee);
        IO.println(coffee.getDescription());
        IO.println(coffee.getCost());

        coffee = new CaramelDecorator(coffee);
        IO.println(coffee.getDescription());
        IO.println(coffee.getCost());
    }
}
