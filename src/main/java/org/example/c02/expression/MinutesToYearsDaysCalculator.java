package org.example.c02.expression;

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
