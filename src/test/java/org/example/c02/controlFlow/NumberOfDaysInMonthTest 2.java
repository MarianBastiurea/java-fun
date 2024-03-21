package org.example.c02.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOfDaysInMonthTest {
    @Test
    public void given1AsMonthAnd2020AsYearShouldReturn31() {
        int month = 1;
        int year = 2020;
        int myResult = 31;
        int result = NumberOfDaysInMonth.getDaysInMonth(month, year);
        assertEquals(myResult, result);
    }
    @Test
    public void given4AsMonthAnd2020AsYearShouldReturn30() {
        int month = 4;
        int year = 2020;
        int myResult = 30;
        int result = NumberOfDaysInMonth.getDaysInMonth(month, year);
        assertEquals(myResult, result);
    }

    @Test
    public void given2AsMonthAnd2020AsYearShouldReturn29() {
        int month = 2;
        int year = 2020;
        int myResult = 29;
        int result = NumberOfDaysInMonth.getDaysInMonth(month, year);
        assertEquals(myResult, result);
    }
    @Test
    public void given2AsMonthAnd2021AsYearShouldReturn28() {
        int month = 2;
        int year = 2021;
        int myResult = 28;
        int result = NumberOfDaysInMonth.getDaysInMonth(month, year);
        assertEquals(myResult, result);
    }

    @Test
    public void givenNegative1AsMonthAnd2020AsYearShouldReturnNegative1() {
        int month = -1;
        int year = 2020;
        int myResult = -1;
        int result = NumberOfDaysInMonth.getDaysInMonth(month, year);
        assertEquals(myResult, result);
    }
}
