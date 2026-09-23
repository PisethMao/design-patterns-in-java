package com.piseth.patterns.creational.factorymethod.notificationexample;

public abstract class NotificationService {
    protected abstract NotificationSender createSender();

    public void notifyUser(String message) {
        NotificationSender sender = createSender();
        sender.send(message);
    }
}
