package org.example.c01.expression;

public class convertFeetAndInchesToCm {
    public static double feetAndInchesToCm(int feet, int inches) {
        double heightInCm = inchesToCm((feet * 12) + inches);
        return heightInCm;
    }

    public static double inchesToCm(int heightInInches) {
        double heightInCm = heightInInches * 2.54;
        return heightInCm;
    }
}
