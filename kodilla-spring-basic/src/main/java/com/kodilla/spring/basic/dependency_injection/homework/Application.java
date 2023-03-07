package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {

        DeliveryService deliveryService = new FastDeliveryService();
        NotificationService notificationService = new SMSNotificationService();

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService,notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);

        ShippingCenter shippingCenter1 =
                new ShippingCenter(new OrdinaryDeliveryService(),new MessengerNotificationService());

        shippingCenter1.sendPackage("Rounding Street 8, Chicago", 25.8);

        ShippingCenter shippingCenter2 =
                new ShippingCenter(new SlowDeliveryService(),new EmailNotificationService());

        shippingCenter2.sendPackage("Apache Square 340, Alaska", 68.4);
    }
}