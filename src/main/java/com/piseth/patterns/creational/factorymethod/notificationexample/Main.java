package com.piseth.patterns.creational.factorymethod.notificationexample;

public class Main {
    void main() {
        NotificationService emailService = new EmailNotificationService();
        emailService.notifyUser("Transaction Completed!");

        NotificationService smsService = new SmsNotificationService();
        smsService.notifyUser("Transaction Completed!");

        NotificationService telegramService = new TelegramNotificationService();
        telegramService.notifyUser("Transaction Completed!");
    }
}
