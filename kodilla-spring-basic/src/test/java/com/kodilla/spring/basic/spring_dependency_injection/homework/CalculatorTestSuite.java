package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    private Display displayMock;

    @BeforeEach
    void setUp() {
        displayMock = Mockito.mock(Display.class);
        calculator = new Calculator(displayMock);
    }

    @Test
    public void shouldDisplayValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Display bean = context.getBean(Display.class);
        String message = bean.display(7);
        Assertions.assertNotNull(message);
    }
    @Test
    void add() {
        double result = calculator.add(2.5, 3.5);
        Assertions.assertEquals(6.0, result);
        Mockito.verify(displayMock).display(6.0);
    }

    @Test
    void subtract() {
        double result = calculator.subtract(2.5, 3.5);
        Assertions.assertEquals(-1.0, result);
        Mockito.verify(displayMock).display(-1.0);
    }

    @Test
    void multiply() {
        double result = calculator.multiply(2.5, 3.5);
        Assertions.assertEquals(8.75, result);
        Mockito.verify(displayMock).display(8.75);
    }

    @Test
    void divide() {
        double result = calculator.divide(10.0, 2.5);
        Assertions.assertEquals(4.0, result);
        Mockito.verify(displayMock).display(4.0);
    }

    @Test
    void divideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10.0, 0);
        });
        Mockito.verifyNoInteractions(displayMock);
    }
}