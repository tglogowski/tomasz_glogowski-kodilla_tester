package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {

    private static final Warehouse warehouse = new Warehouse();

    public static void main(String[] args) {

        addOrders();

        try {
            System.out.println(warehouse.getOrder(inputOrderNumber()));
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }
    }

    private static void addOrders() {

        warehouse.addOrder(new Order("123", "jar"));
        warehouse.addOrder(new Order("456", "chair"));
        warehouse.addOrder(new Order("789", "lamp"));
        warehouse.addOrder(new Order("321", "glass"));
        warehouse.addOrder(new Order("654", "pot"));
    }

    private static String inputOrderNumber() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter order number: ");
            try {
                return scanner.next("[0-9]{0,3}");
            } catch (Exception e) {
                System.out.println("The number must contain 3 digits");
            }
        }
    }
}