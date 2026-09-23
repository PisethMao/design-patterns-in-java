package com.piseth.patterns.creational.factorymethod.notificationexample;

public class TelegramNotificationService extends NotificationService {
    @Override
    protected NotificationSender createSender() {
        return new TelegramSender();
    }
}
