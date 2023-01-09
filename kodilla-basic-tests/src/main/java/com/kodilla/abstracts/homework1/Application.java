package com.kodilla.abstracts.homework1;

public class Application {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(45,100);
        System.out.println("Rectangle area is: " + rectangle.getShapeArea());
        System.out.println("Rectangle perimeter is: " + rectangle.getShapePerimeter());

        Shape square = new Square(60);
        System.out.println("Square area is: " + square.getShapeArea());
        System.out.println("Square perimeter is: " + square.getShapePerimeter());

        Shape circle = new Circle(80);
        System.out.println("Circle area is: " + circle.getShapeArea());
        System.out.println("Circle perimeter is: " + circle.getShapePerimeter());

        Shape isoscelesTriangle = new IsoscelesTriangle(120, 80);
        System.out.println("Triangle area is: " + isoscelesTriangle.getShapeArea());
        System.out.println("Triangle perimeter is: " + isoscelesTriangle.getShapePerimeter());
    }
}
