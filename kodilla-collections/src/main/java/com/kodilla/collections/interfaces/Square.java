package com.kodilla.collections.interfaces;

public class Square implements Shape {
    private  double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
