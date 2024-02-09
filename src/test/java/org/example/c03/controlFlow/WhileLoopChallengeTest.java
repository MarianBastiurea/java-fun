package org.example.c03.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WhileLoopChallengeTest {
    @Test
    public void given5AsStartAnd20AsFinishShouldReturn8Numbers() {
        int start = 5;
        int end = 20;
        int[] myResult = {6, 8, 10, 12, 14, 16, 18, 20};
        int[] result = WhileLoopChallenge.storeEven(start, end);
        assertArrayEquals(result, myResult);
    }
}
