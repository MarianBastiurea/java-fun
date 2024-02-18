package org.example.c01.expression;

/*
Leap Year Calculator
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is
 not in that range return false.Otherwise, if it is in the valid range, calculate if the year is a leap year
 and return true if it is a leap year, otherwise return false.
 A leap year is a year that is divisible by 4 but not 100.
If it's divisible by 100, it has to be divisible by 400.

The following years are not leap years:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
This is because they are evenly divisible by 100 but not by 400.

 */
public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if(year >=1 && year <=9999 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)){
            leapYear = true;
        }
        return leapYear;
    }
}
