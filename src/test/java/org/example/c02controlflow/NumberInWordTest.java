package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberInWordTest {
    @Test
    public void given1ShouldReturnOne() {
        int number = 1;
        String word = "ONE";
        String result = NumberInWord.printNumberInWord(number);
        assertEquals(word, result);
    }

    @Test
    public void givenNegative1ShouldReturnOther() {
        int number = -1;
        String word = "OTHER";
        String result = NumberInWord.printNumberInWord(number);
        assertEquals(word, result);
    }

    @Test
    public void given10ShouldReturnOther() {
        int number = 10;
        String word = "OTHER";
        String result = NumberInWord.printNumberInWord(number);
        assertEquals(word, result);
    }
}
