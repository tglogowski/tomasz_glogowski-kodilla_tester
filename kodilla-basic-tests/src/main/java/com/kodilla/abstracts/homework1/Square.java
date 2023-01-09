package com.kodilla.abstracts.homework1;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        super (a, 0, 0,0);
        this.a = a;
    }
    @Override
    public double getShapeArea() {
        return a * a;
    }

    @Override
    public double getShapePerimeter() {
        return 4 * a;
    }
}
