package com.kodilla.spring.basic.dependency_injection.homework;

public class EmailNotificationService implements NotificationService{

    public void success(String address) {
        System.out.println("Package delivered to: " + address + "-=send via email=-");
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + " -=send via email=-");
    }
}
