package org.example.c01expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class isTeenTest {
    @Test
    public void givenNegative2ShouldReturnFalse() {
        int age = -2;
        boolean myResult = false;
        boolean result = isTeen.checkIsTeen(age);
        assertEquals(myResult, result);
    }

    @Test
    public void given2ShouldReturnFalse() {
        int age = 2;
        boolean myResult = false;
        boolean result = isTeen.checkIsTeen(age);
        assertEquals(myResult, result);
    }

    @Test
    public void given13ShouldReturnTrue() {
        int age = 13;
        boolean myResult = true;
        boolean result = isTeen.checkIsTeen(age);
        assertEquals(myResult, result);
    }
}
