package com.piseth.patterns.creational.abstracfactory.uiexample.product;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        IO.println("Checking Windows Checkbox");
    }
}
