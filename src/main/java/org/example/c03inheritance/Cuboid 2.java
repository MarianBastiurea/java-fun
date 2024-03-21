package org.example.c03inheritance;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}
