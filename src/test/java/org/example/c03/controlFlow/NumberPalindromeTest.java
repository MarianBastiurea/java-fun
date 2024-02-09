package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberPalindromeTest {
    @Test
    public void given12321ShouldReturnTrue() {
        int number = 12321;
        boolean isPalindrome = true;
        boolean result = NumberPalindrome.isPalindrome(number);
        assertEquals(result, isPalindrome);
    }
}
