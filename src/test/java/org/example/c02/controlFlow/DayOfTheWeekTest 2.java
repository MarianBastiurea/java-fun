package org.example.c02.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfTheWeekTest {
    @Test
    public void input0ShouldReturnSunday() {
        int day = 0;
        String myDay = "Sunday";
        String result = DayOfTheWeek.printDayOfTheWeek(day);
        assertEquals(myDay, result);
    }

    @Test
    public void input7ShouldInvalidDay() {
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

    @Test
    public void given7ShouldReturnInvalidValue() {
        int day = 7;
        String myDay = "Invalid Day";
        String result = DayOfTheWeek.printWeekDay(day);
        assertEquals(myDay, result);
    }
}
