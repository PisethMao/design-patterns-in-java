package com.piseth.patterns.structural.composite.foodexample;

import java.math.BigDecimal;

public class Main {
    public static void main() {
        Menu mainMenu = new Menu("Main Menu");

        Menu foodMenu = new Menu("\tFood Menu");
        Menu drinkMenu = new Menu("\tDrink Menu");
        Menu khmerMenu = new Menu("\tKhmer Menu");

        khmerMenu.add(new MenuItem("\t\tAmok", new BigDecimal("5.00")));
        khmerMenu.add(new MenuItem("\t\tLok Lak", new BigDecimal("6.00")));
        khmerMenu.add(new MenuItem("\t\tBurger", new BigDecimal("4.00")));
        foodMenu.add(khmerMenu);
        drinkMenu.add(new MenuItem("\t\tCoffee", new BigDecimal("2.00")));
        mainMenu.add(foodMenu);
        mainMenu.add(drinkMenu);
        mainMenu.display();
    }
}
