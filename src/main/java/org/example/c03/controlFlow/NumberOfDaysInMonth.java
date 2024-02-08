package org.example.c03.controlFlow;
/*
Write a method isLeapYear with a
parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameters month and year.  Both of type int.
If parameter month is < 1 or > 12 return -1.
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month.
 Be careful about leap years they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear described above.
*/

public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year) {
        int result;
        if (month < 1 || month > 12 || year <= 1 || year >= 9999) {
            return -1;
        }
        switch (month) {
            case 1, 3, 5, 7, 10, 8, 12:
                result = 31;
                break;
            case 2: {
                if (isLeapYear(year)) {
                    result = 29;
                } else result = 28;
            }
            break;
            case 4, 6, 9, 11:
                result = 30;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;
        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        } else leapYear = year % 400 == 0;
        return leapYear;
    }
}
