package com.piseth.patterns.creational.abstracfactory.uiexample.product;

public class MacButton implements Button{
    @Override
    public void render() {
        IO.println("Rendering Mac Button");
    }
}
