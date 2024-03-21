package org.example.c01.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedConverterTest {
    @Test
    public void negativeValueForKmShouldReturnNegative1() {
        int kilometersPerHour = -10;
        long milesPerHour = -1;
        long result = SpeedConverter.toMilesPerHour(kilometersPerHour);
        assertEquals(milesPerHour, result);
    }

    @Test
    public void ValueOf10KmShouldReturn16() {
        int kilometersPerHour = 10;
        long milesPerHour = 16;
        long result = SpeedConverter.toMilesPerHour(kilometersPerHour);
        assertEquals(milesPerHour, result);
    }
}

