package org.example.c02.controlFlow;

/*
Write a method named printFactors with one parameter of type int named number.
If number is < 1, the method should print "Invalid Value".
The method should print all factors of the number. A factor of a number is an integer which divides
 that number wholly (i.e. without leaving a remainder).
For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.
 */
public class FactorPrinter {
    public static int[] printFactors(int number) {
        int count = 0;
        if (number < 0) {
            int[] result = {-1};
            return result;
        }
        int[] temporary = new int[number];
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                temporary[count] = i;
                count++;
            }
        }
        int[] result = new int[count + 1];
        for (int i = 0; i < count; i++) {
            result[i] = temporary[i];
        }
        result[count] = number;
        return result;
    }
}
