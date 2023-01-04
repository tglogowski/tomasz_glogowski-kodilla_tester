package com.kodilla.abstracts.homework1;

public class IsoscelesTriangle extends Shape {

    public IsoscelesTriangle(double a, double h) {
        super(a, 0,0, h);
    }

    @Override
    public double getShapeArea() {
        return 0.5 * getA() * getH();
    }

    @Override
    public double getShapePerimeter() {
        return 3 * getA();
    }
}
