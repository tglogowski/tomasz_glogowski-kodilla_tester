package com.kodilla.abstracts.homework1;

public class Rectangle extends Shape {

    private double a;
    private double b;


    public Rectangle(double a, double b) {
        super(a, b, 0, 0);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getShapeArea() {
        return a * b;
    }

    @Override
    public double getShapePerimeter() {
        return 2 * a * b;
    }

}
