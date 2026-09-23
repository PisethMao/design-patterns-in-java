package com.piseth.patterns.creational.factorymethod.notificationexample;

public class SmsSender implements NotificationSender {
    @Override
    public void send(String message) {
        IO.println("Sending SMS: " + message);
    }
}
