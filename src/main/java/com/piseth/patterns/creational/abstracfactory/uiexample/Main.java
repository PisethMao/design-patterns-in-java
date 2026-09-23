package com.piseth.patterns.creational.abstracfactory.uiexample;

import com.piseth.patterns.creational.abstracfactory.uiexample.factory.MacUIFactory;
import com.piseth.patterns.creational.abstracfactory.uiexample.factory.UIFactory;
import com.piseth.patterns.creational.abstracfactory.uiexample.factory.WindowsUIFactory;

public class Main {
    void main(){
        UIFactory factory = new WindowsUIFactory();
        UIFactory macFactory = new MacUIFactory();
        Application app = new Application(factory);
        app.renderUI();

        Application macApp = new Application(macFactory);
        macApp.renderUI();
    }
}
