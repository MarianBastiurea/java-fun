package org.example.c02controlflow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NatoAlphabetTest {
    @Test
    public void givenAShouldReturnAlpha() {
        char letter = 'A';
        String myWord = "Alpha";
        String result = NatoAlphabet.equivalentWord(letter);
        assertEquals(myWord, result);
    }
    @Test
    public void givenXShouldReturnNoLetterFound() {
        char letter = 'X';
        String myWord = "Letter X not found";
        String result = NatoAlphabet.equivalentWord(letter);
        assertEquals(myWord, result);
    }

    @Test
    public void givenALowercaseShouldReturnNoLetterFound() {
        char letter = 'a';
        String myWord = "Letter a not found";
        String result = NatoAlphabet.equivalentWord(letter);
        assertEquals(myWord, result);
    }
}
