package com.piseth.patterns.behavioral.templatemethod.dataformatexample;

public class Main {
    public static void main() {
        DataProcessor csvProcessor = new CsvProcessor();
        csvProcessor.process();
        IO.println();
        DataProcessor jsonProcessor = new JsonProcessor();
        jsonProcessor.process();
    }
}
