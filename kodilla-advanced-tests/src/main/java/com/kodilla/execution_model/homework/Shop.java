package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) throws OrderException {

            LocalDate currentDate = LocalDate.now();
            if (order.getDate().isAfter(currentDate)) {
                throw new OrderException("Order date cannot be later than the current date.");
            }

            LocalDate shopStartDate = LocalDate.of(2023, 1, 2);
            if (order.getDate().isBefore(shopStartDate)) {
                throw new OrderException("The order date cannot be earlier than 02.01.2023.");
            }
        orders.add(order);
    }

    public List<Order> findOrdersFromDateToDate(LocalDate startDate, LocalDate endDate) {
        List<Order> ordersWithinRange = new ArrayList<>();
        for(Order order : orders) {
            if(!order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate)) {
                ordersWithinRange.add(order);
            }
        }
        return ordersWithinRange;
    }

    public List<Order> findOrdersFromValueRange(double minValue, double maxValue) {
        List<Order> ordersWithinRange = new ArrayList<>();
        for(Order order : orders) {
            if(order.getValue() >= minValue && order.getValue() <= maxValue) {
                ordersWithinRange.add(order);
            }
        }
        return ordersWithinRange;
    }

    public int getNumberOfOrders(){
        return orders.size();
    }

    public double getTotalOrdersValue(){
        double totalOrderValue = 0.0;
        for(Order order : orders) {
            totalOrderValue += order.getValue();
        }
        return totalOrderValue;
    }

    public Set<Order> getOrders(){
        return orders;
    }
}
