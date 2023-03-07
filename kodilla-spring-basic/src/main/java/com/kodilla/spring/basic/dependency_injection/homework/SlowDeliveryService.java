package com.kodilla.spring.basic.dependency_injection.homework;

public class SlowDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        System.out.println("Slow Delivery in progress...");
        return true;
    }
}