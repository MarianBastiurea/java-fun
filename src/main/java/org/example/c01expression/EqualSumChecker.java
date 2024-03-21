package org.example.c01expression;

/*
Equal Sum Checker
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter
is equal to the third parameter. Otherwise, return false.
 */

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sum) {
        boolean sumAreEqual = false;
        int sumOfTwoNumber = firstNumber + secondNumber;
        if (sumOfTwoNumber == sum) {
            sumAreEqual = true;
        } else sumAreEqual = false;
        return sumAreEqual;
    }
}
