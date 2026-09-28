package com.piseth.patterns.behavioral.observer.ecomerceexample;

public class AnalyticsObserver implements OrderObserver {
    @Override
    public void update(String id, String status) {
        IO.println("[ANALYTICS] Reordering order event: " + id + " -> " + status);
    }
}
