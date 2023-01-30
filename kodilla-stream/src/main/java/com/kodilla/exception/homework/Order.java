package com.kodilla.exception.homework;

public class Order {

    private String number;
    private String itemName;

    public Order(String number, String itemName) {
        this.number = number;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
