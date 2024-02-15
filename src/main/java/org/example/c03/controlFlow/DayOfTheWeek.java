package org.example.c03.controlFlow;

public class DayOfTheWeek {
    public static String printDayOfTheWeek(int day) {
        String result;
        switch (day) {
            case 0 -> result = "Sunday";
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            default -> result = "Invalid day";
        }
        return result;
    }

    public static String printWeekDay(int day) {
        String result;
        if (day == 0) {
            result = "Sunday";
        } else if (day == 1) {
            result = "Monday";
        } else if (day == 2) {
            result = "Tuesday";
        } else if (day == 3) {
            result = "Wednesday";
        } else if (day == 4) {
            result = "Thursday";
        } else if (day == 5) {
            result = "Friday";
        } else if (day == 6) {
            result = "Saturday";
        } else result = "Invalid Day";
        return result;
    }
}
