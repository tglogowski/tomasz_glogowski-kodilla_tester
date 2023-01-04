package com.kodilla.abstracts.homework1;

public class Square extends Shape {

    public Square(double a) {
        super (a, 0, 0,0);
    }
    @Override
    public double getShapeArea() {
        return getA()*getA();
    }

    @Override
    public double getShapePerimeter() {
        return 4 * getA();
    }
}
