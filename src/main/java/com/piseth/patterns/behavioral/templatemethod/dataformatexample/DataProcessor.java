package com.piseth.patterns.behavioral.templatemethod.dataformatexample;

public abstract class DataProcessor {
    public final void process() {
        readData();
        validateData();
        transformData();
        saveData();
    }

    protected abstract void readData();

    protected abstract void transformData();

    protected void validateData() {
        IO.println("Default validation");
    }

    private void saveData() {
        IO.println("Saving data");
    }
}
