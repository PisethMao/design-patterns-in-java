package com.piseth.patterns.creational.factorymethod.notificationexample;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        IO.println("Sending EMAIL: " + message);
    }
}
