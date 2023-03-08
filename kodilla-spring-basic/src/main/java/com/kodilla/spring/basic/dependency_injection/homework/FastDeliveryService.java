package com.kodilla.spring.basic.dependency_injection.homework;

public class FastDeliveryService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 12) {
            System.out.println("Package too heavy for express delivery");
            return false;
        }
        System.out.println("Express delivery in progress...");
        return true;
    }
}
