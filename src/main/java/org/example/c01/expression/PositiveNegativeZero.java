package org.example.c01.expression;

public class PositiveNegativeZero {
    public static String checkNumber(int number) {
        String result;
        if (number < 0) {
            result = "negative";
        } else if (number == 0) {
            result = "zero";
        } else result = "positive";
        return result;
    }
}
