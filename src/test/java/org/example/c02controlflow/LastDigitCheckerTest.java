package org.example.c02controlflow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LastDigitCheckerTest {
    @Test
    public void given12And12And21ShouldReturnTrue() {
        int firstNumber = 12;
        int secondNumber = 12;
        int thirdNumber = 21;
        boolean isTheSameLastDigit = true;
        boolean result = LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber);
        assertEquals(isTheSameLastDigit, result);
    }

    @Test
    public void givenNegative12And12And21ShouldReturnFalse() {
        int firstNumber = -12;
        int secondNumber = 12;
        int thirdNumber = 21;
        boolean isTheSameLastDigit = false;
        boolean result = LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber);
        assertEquals(isTheSameLastDigit, result);
    }

    @Test
    public void given2And12And21ShouldReturnFalse() {
        int firstNumber = 2;
        int secondNumber = 12;
        int thirdNumber = 21;
        boolean isTheSameLastDigit = false;
        boolean result = LastDigitChecker.hasSameLastDigit(firstNumber, secondNumber, thirdNumber);
        assertEquals(isTheSameLastDigit, result);
    }
}
