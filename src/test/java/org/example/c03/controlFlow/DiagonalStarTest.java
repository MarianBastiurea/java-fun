package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiagonalStarTest {
    @Test
    public void generateRectangle() {
        int number = 5;
        String rectangle = DiagonalStar.printSquareStar(number);
        assertEquals("""
                *****
                ** **
                * * *
                ** **
                *****
                """, rectangle);
    }
}
