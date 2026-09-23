package com.piseth.patterns.creational.abstracfactory.uiexample.factory;

import com.piseth.patterns.creational.abstracfactory.uiexample.product.Button;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.Checkbox;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.WindowsButton;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
