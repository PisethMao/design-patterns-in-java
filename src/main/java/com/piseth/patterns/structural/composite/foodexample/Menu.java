package com.piseth.patterns.structural.composite.foodexample;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent{
    private final String name;
    private final List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void display() {
        IO.println(name);
        menuComponents.forEach(MenuComponent::display);
    }
}
