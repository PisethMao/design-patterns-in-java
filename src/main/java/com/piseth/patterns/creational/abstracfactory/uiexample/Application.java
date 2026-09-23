package com.piseth.patterns.creational.abstracfactory.uiexample;

import com.piseth.patterns.creational.abstracfactory.uiexample.factory.UIFactory;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.Button;
import com.piseth.patterns.creational.abstracfactory.uiexample.product.Checkbox;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI(){
        button.render();
        checkbox.check();
    }
}
