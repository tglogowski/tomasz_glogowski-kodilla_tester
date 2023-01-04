package com.kodilla.abstracts.homework1;

public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b, 0, 0);
    }

    @Override
    public double getShapeArea() {
        return getA()*getB();
    }

    @Override
    public double getShapePerimeter() {
        return 2 * getA() + 2 * getB();
    }

}
