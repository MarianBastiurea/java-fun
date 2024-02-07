package org.example.c03.ontrolFlow;

import static org.junit.jupiter.api.Assertions.*;

import org.example.c03.controlFlow.PrimeNumberCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCounterTest {
    @Test
    public void given3and9ShouldReturn3PrimeNumber() {
        int lower = 3;
        int upper = 9;
        int[] myResult = {3, 5, 7};
        int[] result = PrimeNumberCounter.countPrimeNumber(lower, upper);
        assertArrayEquals(myResult, result);
    }
}
