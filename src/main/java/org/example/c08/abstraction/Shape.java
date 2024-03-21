package org.example.c08.abstraction;

/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate
  the area and perimeter of each shape.
 */
abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Circle area is: " + area);
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter is: " + perimeter);
        return perimeter;
    }
}

class Triangle extends Shape {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double calculateArea() {
        double s = (s1 + s2 + s3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    double calculatePerimeter() {
        return s1 + s2 + s3;
    }
}

