package com.piseth.patterns.behavioral.observer.ecomerceexample;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private String status;
    private final List<OrderObserver> orderObservers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
        this.status = "PENDING";
    }

    public void subscribe(OrderObserver orderObserver) {
        orderObservers.add(orderObserver);
    }

    public void unsubscribe(OrderObserver orderObserver) {
        orderObservers.remove(orderObserver);
    }

    private void notifyObservers() {
        for (OrderObserver observer : orderObservers) {
            observer.update(id, status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
