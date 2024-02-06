package org.example.c02.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntEqualityPrinterTest {
    @Test
    public void given1and1and1ShouldReturnAllNumbersAreEqual() {
        int number1 = 1;
        int number2 = 1;
        int number3 = 1;
        String myResult = "All numbers are equal";
        String result = IntEqualityPrinter.printEqual(number1, number2, number3);
        assertEquals(myResult, result);
    }

    @Test
    public void givenNegative1and1and1ShouldReturnInvalidValue() {
        int number1 = -1;
        int number2 = 1;
        int number3 = 1;
        String myResult = "Invalid value";
        String result = IntEqualityPrinter.printEqual(number1, number2, number3);
        assertEquals(myResult, result);
    }

    @Test
    public void given1and2and3ShouldReturnAllNumbersAreDifferent() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        String myResult = "All numbers are different";
        String result = IntEqualityPrinter.printEqual(number1, number2, number3);
        assertEquals(myResult, result);
    }

    @Test
    public void given1and2and2ShouldReturnNeitherAllAreEqualOrDifferent() {
        int number1 = 1;
        int number2 = 2;
        int number3 = 2;
        String myResult = "Neither all are equal or different";
        String result = IntEqualityPrinter.printEqual(number1, number2, number3);
        assertEquals(myResult, result);
    }
}
