package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        Order order = orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
        return order;
    }
}