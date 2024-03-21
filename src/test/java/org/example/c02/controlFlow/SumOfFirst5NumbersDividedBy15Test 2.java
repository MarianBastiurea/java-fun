package org.example.c02.controlFlow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SumOfFirst5NumbersDividedBy15Test {
    @Test
    public void given1AsLowerNumberAnd1000AsUpperNumberShouldReturn90AsSum() {
        int lower = 1;
        int upper = 1000;
        int sum = 225;
        int[] resultNumbers = {15, 30, 45, 60, 75};
        int[] result = SumOfFirst5NumbersDividedBy15.findNumbers(lower, upper);
        assertArrayEquals(result, resultNumbers);
        int sumResult = SumOfFirst5NumbersDividedBy15.findSum(result);
        assertEquals(sumResult, sum);
    }

}
