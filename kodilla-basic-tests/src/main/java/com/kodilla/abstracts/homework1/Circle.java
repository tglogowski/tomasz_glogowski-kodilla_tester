package com.kodilla.abstracts.homework1;

public class Circle extends Shape {

    private final double PI = 3.1415927;
    private double r;

    public Circle(double r) {
        super (0,0, r, 0);
        this.r = r;
    }

    @Override
    public double getShapeArea() {
        return r * r * PI;
    }

    @Override
    public double getShapePerimeter() {
        return 2 * PI * r;
    }
}
