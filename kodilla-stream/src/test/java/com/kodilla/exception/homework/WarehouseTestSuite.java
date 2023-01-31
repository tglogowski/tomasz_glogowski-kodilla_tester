package com.kodilla.exception.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

    public void initOrders() {

        warehouse.addOrder(new Order("123", "jar"));
        warehouse.addOrder(new Order("456", "chair"));
        warehouse.addOrder(new Order("789", "lamp"));
        warehouse.addOrder(new Order("321", "glass"));
        warehouse.addOrder(new Order("654", "pot"));
    }

    @BeforeEach
    public void setup() {
        initOrders();
    }

    @Test
    public void testIsOrderPlaced() throws OrderDoesntExistException {

        //given
        //when
        Order order = warehouse.getOrder("789");
        String expectedItem = order.getItemName();
        //then
        assertEquals(expectedItem,"lamp");
    }

    @Test
    public void testGetOrder_withException() {

        //given
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("999"));
    }

}