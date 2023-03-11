package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ShippingCenterTestSuite {


    @Test
    public void shouldReturnSuccessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Test address", 20);
        Assertions.assertEquals("Package delivered to: Test address", message);
    }

    @Test
    public void shouldReturnFailMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Test address", 40);
        Assertions.assertEquals("Package not delivered to: Test address", message);
    }
}