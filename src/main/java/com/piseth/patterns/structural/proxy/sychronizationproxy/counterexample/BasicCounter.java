package com.piseth.patterns.structural.proxy.sychronizationproxy.counterexample;

public class BasicCounter implements Counter {
    private int value = 0;

    @Override
    public void increment() {
        int currentValue = value;
        Thread.yield();
        value = currentValue + 1;
    }

    @Override
    public int getCounter() {
        return value;
    }
}
