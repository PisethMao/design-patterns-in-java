package com.piseth.patterns.creational.factorymethod.notificationexample;

public class TelegramSender implements NotificationSender {
    @Override
    public void send(String message) {
        IO.println("Sending Telegram Notification: " + message);
    }
}
