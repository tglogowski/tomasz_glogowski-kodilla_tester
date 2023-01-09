package com.kodilla.abstracts.homework1;

public class IsoscelesTriangle extends Shape {

    private double a;
    private double h;


    public IsoscelesTriangle(double a, double h) {
        super(a, 0,0, h);
        this.a = a;
        this.h = h;

    }

    @Override
    public double getShapeArea() {
        return 0.5 * a * h;
    }

    @Override
    public double getShapePerimeter() {
        return 3 * a;
    }
}
