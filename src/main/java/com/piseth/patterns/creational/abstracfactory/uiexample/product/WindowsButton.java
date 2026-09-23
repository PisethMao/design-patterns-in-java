package com.piseth.patterns.creational.abstracfactory.uiexample.product;

public class WindowsButton implements Button {
    @Override
    public void render() {
        IO.println("Rendering Windows Button");
    }
}
