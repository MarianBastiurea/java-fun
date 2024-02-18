package org.example.c01.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondAndMinutesChallengeTest {
    @Test
    public void given3800SecondsShouldReturn1Hour3MinAnd20sec() {
        int second = 3800;
        String myResult = "1h 3m 20s";
        String result = SecondAndMinutesChallenge.getDurationString(second);
        assertEquals(myResult, result);
    }
    @Test
    public void givenNegative3600SecondsShouldReturnInvalidValue() {
        int second = -3600;
        String myResult = "Invalid value";
        String result = SecondAndMinutesChallenge.getDurationString(second);
        assertEquals(myResult, result);
    }
}
