package com.piseth.patterns.creational.factorymethod.notificationexample;

public class SmsNotificationService extends NotificationService {
    @Override
    protected NotificationSender createSender() {
        return new SmsSender();
    }
}
