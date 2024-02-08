package org.example.c03.controlFlow;

/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.

The method needs to find the first and the last digit of the parameter number passed to the method,
 using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.

 */
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return sum = -1;
        } else {
            int lastDigit = number % 10;
            int firstDigit = 0;
            while (number != 0) {
                if (number / 10 == 0) {
                    firstDigit = number;
                }
                number /= 10;
            }
            sum = firstDigit + lastDigit;
            return sum;
        }
    }
}

