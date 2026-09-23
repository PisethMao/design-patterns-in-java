package com.piseth.patterns.creational.singleton.memoryexample;

// 6. Enum Singleton
public enum AppConfigEnum {
    INSTANCE;

    public void printConfig() {
        IO.println("Production");
    }
}
