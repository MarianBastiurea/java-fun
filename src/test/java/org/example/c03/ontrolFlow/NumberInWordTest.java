package org.example.c03.ontrolFlow;

import org.example.c03.controlFlow.NumberInWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberInWordTest {
    @Test
    public void given1ShouldReturnOne() {
        int number = 1;
        String myNumber = "ONE";
        String result = NumberInWord.printNumberInWord(number);
        assertEquals(myNumber, result);
    }

    @Test
    public void givenNegative1ShouldReturnOther() {
        int number = -1;
        String myNumber = "OTHER";
        String result = NumberInWord.printNumberInWord(number);
        assertEquals(myNumber, result);
    }

    @Test
    public void given10ShouldReturnOther() {
        int number = 10;
        String myNumber = "OTHER";
        String result = NumberInWord.printNumberInWord(number);
        assertEquals(myNumber, result);
    }
}
