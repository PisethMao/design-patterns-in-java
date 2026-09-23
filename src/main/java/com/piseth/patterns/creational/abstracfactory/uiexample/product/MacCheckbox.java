package com.piseth.patterns.creational.abstracfactory.uiexample.product;

public class MacCheckbox implements Checkbox{
    @Override
    public void check() {
        IO.println("Checking Mac Checkbox");
    }
}
