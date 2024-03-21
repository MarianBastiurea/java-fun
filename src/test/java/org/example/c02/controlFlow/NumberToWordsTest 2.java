package org.example.c02.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberToWordsTest {
    @Test
    public void given0ShouldReturnZero() {
        int number = 0;
        String zero = "Zero";
        String result = NumberToWords.numberToWords(number);
        assertEquals(zero, result);
    }

    @Test
    public void givenNegative1ShouldReturnInvalidValue() {
        int number = -1;
        String invalidValue = "Invalid Value";
        String result = NumberToWords.numberToWords(number);
        assertEquals(invalidValue, result);
    }

    @Test
    public void given11ShouldReturnOneOne() {
        int number = 11;
        String eleven = "One One ";
        String result = NumberToWords.numberToWords(number);
        assertEquals(eleven, result);
    }

    @Test
    public void given900ShouldReturnNineOneOne() {
        int number = 900;
        String nineHundred = "Nine Zero Zero ";
        String result = NumberToWords.numberToWords(number);
        assertEquals(nineHundred, result);
    }
}
