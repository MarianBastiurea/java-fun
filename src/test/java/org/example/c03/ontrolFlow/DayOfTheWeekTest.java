package org.example.c03.ontrolFlow;

import org.example.c03.controlFlow.DayOfTheWeek;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfTheWeekTest {
    @Test
    public void given0ShouldReturnSunday() {
        int day = 0;
        String myDay = "Sunday";
        String result = DayOfTheWeek.printDayOfTheWeek(day);
        assertEquals(myDay, result);
    }

    @Test
    public void given7ShouldInvalidDay() {
        int day = 7;
        String myDay = "Invalid day";
        String result = DayOfTheWeek.printDayOfTheWeek(day);
        assertEquals(myDay, result);
    }

    @Test
    public void given1ShouldReturnMonday() {
        int day = 1;
        String myDay = "Monday";
        String result = DayOfTheWeek.printWeekDay(day);
        assertEquals(myDay, result);
    }
}
