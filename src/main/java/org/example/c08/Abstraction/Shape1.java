package org.example.c08.Abstraction;

/*
 Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle,
 and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.
 */
public interface Shape1 {
    double getArea();
}

class Rectangle implements Shape1 {
    private double s1;
    private double s2;

    public Rectangle(double s1, double s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public double getArea() {
        return s1 * s2;
    }
}
