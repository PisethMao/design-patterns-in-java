package com.piseth.patterns.structural.proxy.sychronizationproxy.counterexample;

import java.util.Objects;

public class SynchronizedCounterProxy implements Counter {
    private final Counter target;
    private final Object lock = new Object();

    public SynchronizedCounterProxy(Counter target) {
        this.target = Objects.requireNonNull(target);
    }

    @Override
    public void increment() {
        synchronized (lock) {
            target.increment();
        }
    }

    @Override
    public int getCounter() {
        synchronized (lock) {
            return target.getCounter();
        }
    }
}
