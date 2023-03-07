package com.kodilla.spring.basic.dependency_injection.homework;

public class SMSNotificationService implements NotificationService{

    public void success(String address) {
        System.out.println("SMS message: Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("SMS message: Package not delivered to: " + address);
    }
}
