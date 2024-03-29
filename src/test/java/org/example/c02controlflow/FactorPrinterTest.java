package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorPrinterTest {
    @Test
    public void given10ShouldReturn12510AsDivisors() {
        int number = 10;
        int[] expectedResult = {1, 2, 5, 10};
        int[] result = FactorPrinter.printFactors(number);
        assertArrayEquals(expectedResult, result);
    }
    @Test
    public void given1ShouldReturn1AsDivisor() {
        int number = 1;
        int[] expectedResult = {1};
        int[] result = FactorPrinter.printFactors(number);
        assertArrayEquals(expectedResult, result);
    }
    @Test
    public void givenNegative1ShouldReturnNegative1AsDivisor() {
        int number = -1;
        int[] expectedResult = {-1};
        int[] result = FactorPrinter.printFactors(number);
        assertArrayEquals(expectedResult, result);
    }
}
