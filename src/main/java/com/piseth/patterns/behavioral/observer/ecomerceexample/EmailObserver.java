package com.piseth.patterns.behavioral.observer.ecomerceexample;

public class EmailObserver implements OrderObserver{
    @Override
    public void update(String id, String status) {
        IO.println("[EMAIL] Order " + id + " status changed to " + status);
    }
}
