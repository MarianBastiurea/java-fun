package org.example.c20debugging;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;


public class UtilitiesTestParameterized {

    private static Utilities util;

    @BeforeAll
    public static void setup() {
        util = new Utilities();
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void testRemovePairs(String input, String output) {
        Utilities utilities = new Utilities();
        assertEquals(output, utilities.removePairs(input));
    }

    private static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"ABCDEFF", "ABCDEF"},
                new Object[]{"AB88EFFG", "AB8EFG"},
                new Object[]{"112233445566", "123456"},
                new Object[]{"A", "A"}
        );
    }
}