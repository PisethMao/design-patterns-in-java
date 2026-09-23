package com.piseth.patterns.creational.abstracfactory.uiexample.factory;

import com.piseth.patterns.creational.abstracfactory.uiexample.product.Button;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.Checkbox;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.MacButton;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.MacCheckbox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
