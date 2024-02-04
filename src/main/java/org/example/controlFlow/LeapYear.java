package org.example.controlFlow;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean leapYear = true;
        if (year < 1 || year > 9999) {
            leapYear = false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            leapYear = true;
        } else leapYear=false;
        return leapYear;
    }
}
