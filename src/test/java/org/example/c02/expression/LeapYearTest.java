package org.example.c02.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LeapYearTest {
    @Test
    public void given1700AsYearShouldReturnFalse() {
        int year = 1700;
        boolean isLeapYear = false;
        boolean result = LeapYear.isLeapYear(year);
        assertEquals(isLeapYear, result);
    }

    @Test
    public void givenNegative1600AsYearShouldReturnFalse() {
        int year = -1600;
        boolean isLeapYear = false;
        boolean result = LeapYear.isLeapYear(year);
        assertEquals(isLeapYear, result);
    }

    @Test
    public void given1600AsYearShouldReturnTrue() {
        int year = 1600;
        boolean isLeapYear = true;
        boolean result = LeapYear.isLeapYear(year);
        assertEquals(isLeapYear, result);
    }

    @Test
    public void given2017AsYearShouldReturnFalse() {
        int year = 2017;
        boolean isLeapYear = false;
        boolean result = LeapYear.isLeapYear(year);
        assertEquals(isLeapYear, result);
    }

    @Test
    public void given2000AsYearShouldReturnTrue() {
        int year = 2000;
        boolean isLeapYear = true;
        boolean result = LeapYear.isLeapYear(year);
        assertEquals(isLeapYear, result);
    }

    @Test
    public void given0AsYearShouldReturnFalse() {
        int year = 0;
        boolean isLeapYear = false;
        boolean result = LeapYear.isLeapYear(year);
        assertEquals(isLeapYear, result);
    }
}
