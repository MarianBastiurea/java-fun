package org.example.c01.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinutesToYearsDaysCalculatorTest {
    @Test
    public void given525600AsMinutesShouldReturn1YAnd0D() {
        long minutes = 525600;
        String answer = "525600 min = 1 y and 0 d";
        String result = MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertEquals(answer, result);
    }

    @Test
    public void givenNegative1051200AsMinutesShouldReturnInvalidValue() {
        long minutes = -1051200;
        String answer = "Invalid Value";
        String result = MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertEquals(answer, result);
    }

    @Test
    public void given1051200AsMinutesShouldReturn2YAnd0D() {
        long minutes = 1051200;
        String answer = "1051200 min = 2 y and 0 d";
        String result = MinutesToYearsDaysCalculator.printYearsAndDays(minutes);
        assertEquals(answer, result);
    }
}
