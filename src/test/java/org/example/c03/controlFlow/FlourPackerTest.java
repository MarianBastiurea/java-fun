package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlourPackerTest {
    @Test
    public void given1AsBigWeightAnd0AsSmallWeightAnd4AsGoalShouldReturnFalse() {
        int bigWeight = 1;
        int smallWeight = 0;
        int goals = 4;
        boolean isPossible = false;
        boolean result = FlourPacker.canPack(bigWeight, smallWeight, goals);
        assertEquals(isPossible, result);
    }

    @Test
    public void given1AsBigWeightAnd0AsSmallWeightAnd5AsGoalShouldReturnTrue() {
        int bigWeight = 1;
        int smallWeight = 0;
        int goals = 5;
        boolean isPossible = true;
        boolean result = FlourPacker.canPack(bigWeight, smallWeight, goals);
        assertEquals(isPossible, result);
    }

    @Test
    public void given0AsBigWeightAnd5AsSmallWeightAnd4AsGoalShouldReturnTrue() {
        int bigWeight = 0;
        int smallWeight = 5;
        int goals = 4;
        boolean isPossible = true;
        boolean result = FlourPacker.canPack(bigWeight, smallWeight, goals);
        assertEquals(isPossible, result);
    }

    @Test
    public void givenNegative3AsBigWeightAnd2AsSmallWeightAnd12AsGoalShouldReturnFalse() {
        int bigWeight = -3;
        int smallWeight = 2;
        int goals = 12;
        boolean isPossible = false;
        boolean result = FlourPacker.canPack(bigWeight, smallWeight, goals);
        assertEquals(isPossible, result);
    }

    @Test
    public void given3AsBigWeightAndNegative2AsSmallWeightAnd12AsGoalShouldReturnFalse() {
        int bigWeight = 3;
        int smallWeight = -2;
        int goals = 12;
        boolean isPossible = false;
        boolean result = FlourPacker.canPack(bigWeight, smallWeight, goals);
        assertEquals(isPossible, result);
    }
}
