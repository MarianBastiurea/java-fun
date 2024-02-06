package org.example.c02.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AreaCalculatorTest {
    @Test
    public void given5asRadiusShouldReturn78Point53981() {
        double radius = 5;
        double area = 78.539815d;
        double result = AreaCalculator.area(radius);
        assertEquals(area, result, 0.00001d);
    }

    @Test
    public void givenNegative5asRadiusShouldReturnNegative1() {
        double radius = -50;
        double area = -1;
        double result = AreaCalculator.area(radius);
        assertEquals(area, result);
    }

    @Test
    public void givenNegative2ForXAnd6ForYShouldReturnNegative1() {
        double x = -2;
        double y = 6;
        double area = -1;
        double result = AreaCalculator.area(x, y);
        assertEquals(area, result);
    }

    @Test
    public void given2ForXAnd6ForYShouldReturn12() {
        double x = 2;
        double y = 6;
        double area = 12;
        double result = AreaCalculator.area(x, y);
        assertEquals(area, result);
    }
}
