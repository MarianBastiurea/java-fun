package org.example.c03inheritance;

public class PointTest {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance to (0,0) is: " + first.distance());

        System.out.println("distance between first and second point is: " + first.distance(second));

        System.out.println("distance from point (2,2) to first point is: " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }
}
