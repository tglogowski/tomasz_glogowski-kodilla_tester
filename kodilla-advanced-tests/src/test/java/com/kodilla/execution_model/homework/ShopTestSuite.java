package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void testAddOrder() throws OrderException {
        Order order = new Order(100.0, LocalDate.now(), "user1");
        shop.addOrder(order);
        int result = shop.getOrders().size();
        assertEquals(1, result);
    }

    @Test
    void testAddOrderWithFutureDate() throws OrderException {

        Order order = new Order(100, LocalDate.now().plusDays(1), "user1");
        Assertions.assertThrows(OrderException.class, () -> shop.addOrder(order));
    }

    @Test
    void testAddOrderWithPastDate() throws OrderException {

        LocalDate openingDate = LocalDate.of(2023, 01, 2);
        Order order = new Order(200, LocalDate.of(2022, 12, 12), "user2");
        Assertions.assertThrows(OrderException.class, () -> shop.addOrder(order));
    }

    @Test
    public void testFindOrdersByDateRange() throws OrderException {
        // given
        addOrders();

        // when
        LocalDate startDate = LocalDate.of(2023, 2, 15);
        LocalDate endDate = LocalDate.of(2023, 2, 28);
        List<Order> orders = shop.findOrdersFromDateToDate(startDate, endDate);

        // then
        Assertions.assertEquals(2, orders.size());
    }

    @Test
    public void testFindOrdersByValueRange() throws OrderException {
        // given
        addOrders();

        // when
        double minValue = 200;
        double maxValue = 400;
        List<Order> orders = shop.findOrdersFromValueRange(minValue, maxValue);

        // then
        Assertions.assertEquals(3, orders.size());
    }

    @Test
    public void testSizeOfListAfterOrdersAdds() throws OrderException {
        // given
        addOrders();

        // when
        int actualSize = shop.getNumberOfOrders();

        // then
        Assertions.assertEquals(5, actualSize);
    }

    @Test
    public void testTotalOrderValue() throws OrderException {
        // given
        addOrders();

        // when
        double actualValue = shop.getTotalOrdersValue();

        // then
        Assertions.assertEquals(100 + 150 + 200 + 300 + 400, actualValue);
    }

    private void addOrders() throws OrderException {
        Order order1 = new Order(100, LocalDate.of(2023, 3, 1), "jan123");
        Order order2 = new Order(200, LocalDate.of(2023, 2, 15), "jan123");
        Order order3 = new Order(300, LocalDate.of(2023, 2, 25), "anna456");
        Order order4 = new Order(400, LocalDate.of(2023, 3, 5), "jan123");
        Order order5 = new Order(150, LocalDate.of(2023, 1, 17), "emma295");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }
}