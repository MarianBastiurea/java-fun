package org.example.c03.ontrolFlow;

import org.example.c03.controlFlow.NumberOfDaysInMonth;
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
    public void given2AsMonthAnd2020AsYearShouldReturn29() {
        int month = 2;
        int year = 2020;
        int myResult = 29;
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
