package org.example.c02.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EqualSumCheckerTest {
    @Test
    public void given1And2AsNumbersAndSum7ShouldReturnFalse() {
        int firstNumber = 1;
        int secondNumber = 2;
        int sum = 7;
        boolean sumAreEquals = false;
        boolean result = EqualSumChecker.hasEqualSum(firstNumber, secondNumber, sum);
        assertEquals(sumAreEquals, result);
    }

    @Test
    public void given1And2AsNumbersAndSum3ShouldReturnTrue() {
        int firstNumber = 1;
        int secondNumber = 2;
        int sum = 3;
        boolean sumAreEquals = true;
        boolean result = EqualSumChecker.hasEqualSum(firstNumber, secondNumber, sum);
        assertEquals(sumAreEquals, result);
    }
}
