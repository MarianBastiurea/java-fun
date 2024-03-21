package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenDigitSumTest {
    @Test
    public void given123456789AsNumberShouldReturn20AsSum() {
        int number = 123456789;
        int sum = 20;
        int result = EvenDigitSum.getEvenDigitSum(number);
        assertEquals(result, sum);
    }

    @Test
    public void givenNegative123456789AsNumberShouldReturnNegative1AsSum() {
        int number = -123456789;
        int sum = -1;
        int result = EvenDigitSum.getEvenDigitSum(number);
        assertEquals(result, sum);
    }
}
