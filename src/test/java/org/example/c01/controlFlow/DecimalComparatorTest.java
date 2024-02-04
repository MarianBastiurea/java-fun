package org.example.c01.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecimalComparatorTest {
    @Test
    public void given3Point1756and3Point175ShouldReturnTrue() {
        double firstNumber = 3.1756;
        double secondNumber = 3.175;
        boolean areEquals = true;
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
        assertEquals(areEquals, result);
    }

    @Test
    public void given3Point176and3Point175ShouldReturnFalse() {
        double firstNumber = 3.176;
        double secondNumber = 3.175;
        boolean areEquals = false;
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
        assertEquals(areEquals, result);
    }

    @Test
    public void given3Point0and3Point0ShouldReturnTrue() {
        double firstNumber = 3.0;
        double secondNumber = 3.0;
        boolean areEquals = true;
        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(firstNumber, secondNumber);
        assertEquals(areEquals, result);
    }

}
