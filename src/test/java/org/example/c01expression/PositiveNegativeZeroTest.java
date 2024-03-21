package org.example.c01expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositiveNegativeZeroTest {
    @Test
    public void givenNegative1ShouldReturnNegative() {
        int number = -1;
        String myResult = "negative";
        String result = PositiveNegativeZero.checkNumber(number);
        assertEquals(myResult, result);
    }

    @Test
    public void given1ShouldReturnPositive() {
        int number = 1;
        String myResult = "positive";
        String result = PositiveNegativeZero.checkNumber(number);
        assertEquals(myResult, result);
    }

    @Test
    public void given0ShouldReturnZero() {
        int number = 0;
        String myResult = "zero";
        String result = PositiveNegativeZero.checkNumber(number);
        assertEquals(myResult, result);
    }
}
