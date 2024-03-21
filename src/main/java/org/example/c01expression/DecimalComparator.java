package org.example.c01expression;

/*
DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to
 three decimal places. Otherwise, return false.
 */

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstIntegerNumber = (int) (firstNumber * 1000);
        int secondIntegerNumber = (int) (secondNumber * 1000);
        boolean areEqual = false;
        if (firstIntegerNumber == secondIntegerNumber) {
            areEqual = true;
        } else areEqual = false;
        return areEqual;
    }
}
