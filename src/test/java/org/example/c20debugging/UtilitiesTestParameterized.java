package org.example.c20debugging;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

//@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private static Utilities util;

    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @BeforeAll
    public static void setup() {
        util = new Utilities();
    }

    @ParameterizedTest
    @CsvSource({"ABCDEFF", "ABCDEF",
            "AB88EFFG", "AB8EFG",
            "112233445566", "123456",
            "A", "A"
    })
    public static void testConditions(String input, String output) {
        Utilities utilities = new Utilities();
        assertEquals(output, utilities.removePairs(input));
    }

    // @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals(output, util.removePairs(input));
    }
}