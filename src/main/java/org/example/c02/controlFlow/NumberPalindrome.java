package org.example.c02.controlFlow;
/*
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.
 */
public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        boolean result = false;
        int originalNumber = number;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        if (originalNumber == reverseNumber) {
            result = true;
        }
        return result;
    }
}
