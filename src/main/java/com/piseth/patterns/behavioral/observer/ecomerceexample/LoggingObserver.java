package com.piseth.patterns.behavioral.observer.ecomerceexample;

public class LoggingObserver implements OrderObserver{
    @Override
    public void update(String id, String status) {
        IO.println("[LOG] Order " + id + " changed to " + status);
    }
}
