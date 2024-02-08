package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberToWordsTest {
    @Test
    public void given0ShouldReturnZero() {
        int number = 0;
        String myWords = "Zero";
        String result = NumberToWords.numberToWords(number);
        assertEquals(myWords, result);
    }

    @Test
    public void givenNegative1ShouldReturnInvalidValue() {
        int number = -1;
        String myWords = "Invalid Value";
        String result = NumberToWords.numberToWords(number);
        assertEquals(myWords, result);
    }

    @Test
    public void given11ShouldReturnOneOne() {
        int number = 11;
        String myWords = "One One ";
        String result = NumberToWords.numberToWords(number);
        assertEquals(myWords, result);
    }

    @Test
    public void given900ShouldReturnNineOneOne() {
        int number = 900;
        String myWords = "Nine Zero Zero ";
        String result = NumberToWords.numberToWords(number);
        assertEquals(myWords, result);
    }
}
