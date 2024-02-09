package org.example.c03.controlFlow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimeNumbersCounterTest {
    @Test
    public void given3AsLowerNumberAnd30AsUpperNumberShouldReturn3PrimeNumbers() {
        int lower = 3;
        int upper = 30;
        int[] myResult = {3, 5, 7};
        int[] result = PrimeNumbersCounter.countPrimeNumbers(lower, upper);
        assertArrayEquals(myResult, result);
    }
}
