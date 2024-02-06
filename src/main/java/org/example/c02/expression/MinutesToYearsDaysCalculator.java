package org.example.c02.expression;
/*
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.

 */
public class MinutesToYearsDaysCalculator {
    public static String printYearsAndDays(long minutes) {
        String result = "";
        if (minutes < 0) {
            result = "Invalid Value";
            return result;
        }
        int yearInMinute = 60 * 24 * 365;
        int dayInMinute = 60 * 24;
        long years = minutes / yearInMinute;
        long remainingMinutes = minutes % yearInMinute;
        long days = remainingMinutes / dayInMinute;
        return result = minutes + " min = " + years + " y and " + days + " d";
    }
}
