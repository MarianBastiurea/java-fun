package org.example.c02.expression;

public class IntEqualityPrinter {

    public static String printEqual(int number1, int number2, int number3) {
        String result = "";
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            result = "Invalid value";
        } else if (number1 == number2 && number1 == number3) {
            result = "All numbers are equal";
        } else if (number1 != number2 && number1 != number3 && number2 != number3) {
            result = "All numbers are different";
        } else {
            result = "Neither all are equal or different";
        }
        return result;
    }
}
