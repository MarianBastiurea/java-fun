package org.example.c02.expression;

public class AreaCalculator {
    public static double area(double radius) {
        double areaOfCircle = 0;
        if (radius < 0) {
            return areaOfCircle = -1;
        }
        areaOfCircle = 3.1415926 * radius * radius;
        System.out.println("area of circle is: " + areaOfCircle);
        return areaOfCircle;
    }

    public static double area(double x, double y) {
        double areaOfRectangle;
        if (x <= 0 || y <= 0) {
            return areaOfRectangle = -1;
        }
        areaOfRectangle = x * y;
        System.out.println("area of circle is: " + areaOfRectangle);
        return areaOfRectangle;
    }
}
