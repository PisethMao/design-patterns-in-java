package com.piseth.patterns.behavioral.templatemethod.dataformatexample;

public class CsvProcessor extends DataProcessor{
    @Override
    protected void readData() {
        IO.println("Reading CSV...!");
    }

    @Override
    protected void transformData() {
        IO.println("Transforming CSV...");
    }
}
