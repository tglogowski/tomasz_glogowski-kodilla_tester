package com.kodilla.abstracts.homework1;

public class Circle extends Shape {

    private final double PI = 3.1415927;

    public Circle(double r) {
        super (0,0, r, 0);
    }

    @Override
    public double getShapeArea() {
        return getR()*getR()*PI;
    }

    @Override
    public double getShapePerimeter() {
        return 2 * PI * getR();
    }
}
