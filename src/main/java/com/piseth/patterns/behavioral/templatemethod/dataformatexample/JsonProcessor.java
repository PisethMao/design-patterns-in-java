package com.piseth.patterns.behavioral.templatemethod.dataformatexample;

public class JsonProcessor extends DataProcessor{
    @Override
    protected void readData() {
        IO.println("Reading JSON...!");
    }

    @Override
    protected void transformData() {
        IO.println("Transforming JSON...");
    }
}
