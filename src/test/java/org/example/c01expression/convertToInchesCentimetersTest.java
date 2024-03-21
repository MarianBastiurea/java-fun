package org.example.c01expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class convertToInchesCentimetersTest {
    @Test
    public void given8InchesShouldReturn20Point32Centimeters() {
        int heightInInches = 8;
        double heightInCentimeters = 20.32;
        double result = convertInchesToCentimeters.inchesToCm(heightInInches);
        assertEquals(heightInCentimeters, result);
    }
}
