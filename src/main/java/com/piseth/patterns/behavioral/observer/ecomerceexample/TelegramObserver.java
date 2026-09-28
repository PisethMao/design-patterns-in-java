package com.piseth.patterns.behavioral.observer.ecomerceexample;

public class TelegramObserver implements OrderObserver{
    @Override
    public void update(String id, String status) {
        IO.println("[TELEGRAM] Order " + id + " -> " + status);
    }
}
