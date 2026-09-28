package com.piseth.patterns.behavioral.observer.ecomerceexample;

public class Main {
    public static void main(){
        Order order = new Order("ORD-001");
        OrderObserver email = new EmailObserver();
        OrderObserver logging =  new LoggingObserver();
        OrderObserver analytics = new AnalyticsObserver();
        OrderObserver telegram = new TelegramObserver();
        order.subscribe(email);
        order.subscribe(logging);
        order.subscribe(analytics);
        order.subscribe(telegram);
        order.setStatus("PAID");
    }
}
