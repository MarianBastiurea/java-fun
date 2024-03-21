package org.example.c01expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class convertFeetAndInchesToCmTest {
    @Test
    public void given5feetAnd8InchesShouldReturn172Point72Cm() {
        int heightInFeet = 5;
        int heightInInches = 8;
        double heightInCm = 172.72;
        double result = convertFeetAndInchesToCm.feetAndInchesToCm(heightInFeet, heightInInches);
        assertEquals(heightInCm, result);
    }
}
