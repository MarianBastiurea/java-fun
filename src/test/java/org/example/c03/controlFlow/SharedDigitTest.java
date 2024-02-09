package org.example.c03.controlFlow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SharedDigitTest {
    @Test
    public void given12And23ShouldReturnTrue() {
        int firstNumber = 12;
        int secondNumber = 23;
        boolean isFound = true;
        boolean result = SharedDigit.hasSharedDigit(firstNumber, secondNumber);
        assertEquals(isFound, result);
    }

    @Test
    public void given9And9ShouldReturnFalse() {
        int firstNumber = 9;
        int secondNumber = 9;
        boolean isFound = false;
        boolean result = SharedDigit.hasSharedDigit(firstNumber, secondNumber);
        assertEquals(isFound, result);
    }

    @Test
    public void given9And99ShouldReturnFalse() {
        int firstNumber = 9;
        int secondNumber = 99;
        boolean isFound = false;
        boolean result = SharedDigit.hasSharedDigit(firstNumber, secondNumber);
        assertEquals(isFound, result);
    }

    @Test
    public void given10And100ShouldReturnFalse() {
        int firstNumber = 10;
        int secondNumber = 100;
        boolean isFound = false;
        boolean result = SharedDigit.hasSharedDigit(firstNumber, secondNumber);
        assertEquals(isFound, result);
    }

    @Test
    public void givenNegative19And99ShouldReturnFalse() {
        int firstNumber = -19;
        int secondNumber = 99;
        boolean isFound = false;
        boolean result = SharedDigit.hasSharedDigit(firstNumber, secondNumber);
        assertEquals(isFound, result);
    }
}
