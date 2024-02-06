package org.example.c02.expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingCatTest {
    @Test
    public void givenFalseAnd10DegreesShouldReturnFalse() {
        boolean summer = false;
        int temperature = 10;
        boolean myResult = false;
        boolean result = PlayingCat.isCatPlaying(summer, temperature);
        assertEquals(myResult, result);
    }

    @Test
    public void givenFalseAnd36DegreesShouldReturnFalse() {
        boolean summer = false;
        int temperature = 36;
        boolean myResult = false;
        boolean result = PlayingCat.isCatPlaying(summer, temperature);
        assertEquals(myResult, result);
    }

    @Test
    public void givenFalseAnd35DegreesShouldReturnFalse() {
        boolean summer = false;
        int temperature = 35;
        boolean myResult = true;
        boolean result = PlayingCat.isCatPlaying(summer, temperature);
        assertEquals(myResult, result);
    }

}
