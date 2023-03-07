package com.kodilla.spring.basic.dependency_injection.homework;

public class MessengerNotificationService implements NotificationService{

    public void success(String address) {
        System.out.println("Messenger Notification Service --> Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Messenger Notification Service --> Package not delivered to: " + address);
    }
}
