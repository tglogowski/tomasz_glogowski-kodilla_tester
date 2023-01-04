package com.kodilla.abstracts.homework1;

public abstract class Shape {

    private double a;
    private double b;
    private double r;
    private double h;

    public Shape(double a, double b, double r, double h) {
        this.a = a;
        this.b = b;
        this.r = r;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public abstract double getShapeArea();

    public abstract double getShapePerimeter();
}
