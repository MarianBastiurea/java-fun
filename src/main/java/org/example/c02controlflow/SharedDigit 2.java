package org.example.c02controlflow;

/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.
 */

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        while (firstNumber > 0) {
            int digit1 = firstNumber % 10;
            int tempNum2 = secondNumber;
            while (tempNum2 > 0) {
                int digit2 = tempNum2 % 10;
                if (digit1 == digit2) {
                    return true;
                }
                tempNum2 /= 10;
            }
            firstNumber /= 10;
        }
        return false;
    }
}
