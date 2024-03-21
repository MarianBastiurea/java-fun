package org.example.c08.abstraction;

public class MainShape {
    public static void main(String[] args) {
        double radius = 5;
        Circle circle = new Circle(radius);
        circle.calculateArea();
        circle.calculatePerimeter();
        Triangle triangle = new Triangle(3, 3, 2);
        System.out.println("Triangle area is: " + triangle.calculateArea());
        System.out.println("Triangle perimeter is: " + triangle.calculatePerimeter());
    }
}
