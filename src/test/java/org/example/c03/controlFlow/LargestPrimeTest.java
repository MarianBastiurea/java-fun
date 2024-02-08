package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestPrimeTest {
    @Test
    public void given21ShouldReturn7() {
        int number = 21;
        int largestPrime = 7;
        int result = LargestPrime.getLargestPrime(number);
        assertEquals(largestPrime, result);
    }

    @Test
    public void given7ShouldReturn7() {
        int number = 7;
        int largestPrime = 7;
        int result = LargestPrime.getLargestPrime(number);
        assertEquals(largestPrime, result);
    }

    @Test
    public void given217ShouldReturn31() {
        int number = 217;
        int largestPrime = 31;
        int result = LargestPrime.getLargestPrime(number);
        assertEquals(largestPrime, result);
    }

    @Test
    public void givenNegative21ShouldReturnNegativ1() {
        int number = -21;
        int largestPrime = -1;
        int result = LargestPrime.getLargestPrime(number);
        assertEquals(largestPrime, result);
    }
}