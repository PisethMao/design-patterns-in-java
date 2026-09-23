package com.piseth.patterns.creational.abstracfactory.uiexample.factory;

import com.piseth.patterns.creational.abstracfactory.uiexample.product.Button;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
