package org.example.c02.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumOddRangeTest {
    @Test
    public void given0AsStartAnd10AsEndShouldReturn25() {
        int start = 0;
        int end = 10;
        int sum = 25;
        int result = SumOddRange.sumOdd(start, end);
        assertEquals(result, sum);
    }

    @Test
    public void givenNegative1AsStartAnd10AsEndShouldReturnNegative1() {
        int start = -1;
        int end = 10;
        int sum = -1;
        int result = SumOddRange.sumOdd(start, end);
        assertEquals(result, sum);
    }

    @Test
    public void given1AsStartAndNegative10AsEndShouldReturnNegative1() {
        int start = 1;
        int end = -10;
        int sum = -1;
        int result = SumOddRange.sumOdd(start, end);
        assertEquals(result, sum);
    }

    @Test
    public void given10AsStartAnd1AsEndShouldReturnNegative1() {
        int start = 10;
        int end = 1;
        int sum = -1;
        int result = SumOddRange.sumOdd(start, end);
        assertEquals(result, sum);
    }
    @Test
    public void given10AsStartAnd10AsEndShouldReturn0() {
        int start = 10;
        int end = 10;
        int sum = 0;
        int result = SumOddRange.sumOdd(start, end);
        assertEquals(result, sum);
    }
    @Test
    public void given13AsStartAnd13AsEndShouldReturn13() {
        int start = 13;
        int end = 13;
        int sum = 13;
        int result = SumOddRange.sumOdd(start, end);
        assertEquals(result, sum);
    }
}
