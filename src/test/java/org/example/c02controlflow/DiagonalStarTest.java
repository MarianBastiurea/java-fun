package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiagonalStarTest {
    @Test
    public void generateRectangle() {
        int number = 5;
        String rectangle = DiagonalStar.printRectangleStar(number);
        assertEquals("""
                *****
                ** **
                * * *
                ** **
                *****
                """, rectangle);
    }

    @Test
    public void generateNoRectangle() {
        int number = 1;
        String rectangle = DiagonalStar.printRectangleStar(number);
        assertEquals("Invalid Value", rectangle);
    }
}
