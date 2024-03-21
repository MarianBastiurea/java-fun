package org.example.c01expression;

/*
Write a method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in
range 13(inclusive) - 19 (inclusive).Otherwise return false.
 */
public class isTeen {
    public static boolean checkIsTeen(int age) {
        boolean result = false;
        if (age >= 13 && age <= 19)
            result = true;
        return result;
    }
}
