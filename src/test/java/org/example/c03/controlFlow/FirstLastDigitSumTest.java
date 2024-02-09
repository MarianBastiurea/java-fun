package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstLastDigitSumTest {
    @Test
    public void given1234AsNumberShouldReturn5AsSum() {
        int number = 1234;
        int sum = 5;
        int result = FirstLastDigitSum.sumFirstAndLastDigit(number);
        assertEquals(result, sum);
    }

    @Test
    public void givenNegative1234AsNumberShouldReturnNegative1AsSum() {
        int number = -1234;
        int sum = -1;
        int result = FirstLastDigitSum.sumFirstAndLastDigit(number);
        assertEquals(result, sum);
    }

    @Test
    public void given12AsNumberShouldReturn3AsSum() {
        int number = 12;
        int sum = 3;
        int result = FirstLastDigitSum.sumFirstAndLastDigit(number);
        assertEquals(result, sum);
    }

    @Test
    public void given7AsNumberShouldReturn14AsSum() {
        int number = 7;
        int sum = 14;
        int result = FirstLastDigitSum.sumFirstAndLastDigit(number);
        assertEquals(result, sum);
    }
}
