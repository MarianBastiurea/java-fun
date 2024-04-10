package org.example.c20debugging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void everyNthChar() {
        Utilities utilities = new Utilities();
        char[] sourceArray = {'H', 'E', 'L', 'L', 'O'};
        char[] result = {'E', 'L'};
        assertArrayEquals(result, utilities.everyNthChar(sourceArray, 2));
        char[] result1 = sourceArray;
        assertArrayEquals(result1, utilities.everyNthChar(sourceArray, 6));
    }

    @Test
    void removePairs() {
        Utilities utilities = new Utilities();
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull(null, utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    void converter() {
        Utilities utilities = new Utilities();
        assertEquals(300, utilities.converter(10,5));

    }
    @Test(expected=ArithmeticException.class)
     void converterArithmeticException() throws Exception{
        Utilities utilities = new Utilities();
        utilities.converter(10,0);
    }

    @Test
    void nullIfOddLength() {
        Utilities utilities = new Utilities();
        assertNull(utilities.nullIfOddLength("AABCDDEFF"));
        assertNotNull(utilities.nullIfOddLength("AABCCDDEFF"));


    }
}