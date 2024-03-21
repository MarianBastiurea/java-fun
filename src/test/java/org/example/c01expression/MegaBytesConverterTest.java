package org.example.c01expression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MegaBytesConverterTest {
    @Test
    public void givenNegative1024ForKBShouldReturnInvalidValue() {
        int kiloBytes = -1024;
        String myResult = "Invalid Value";
        String result = MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes);
        assertEquals(myResult, result);
    }

    @Test
    public void given2500KBShouldReturn2MbAnd452KB() {
        int kiloBytes = 2500;
        String myResult = "2500 KB = 2 MB and 452 KB";
        String result = MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes);
        assertEquals(myResult, result);
    }

    @Test
    public void given0KBShouldReturn0MbAnd0KB() {
        int kiloBytes = 2500;
        String myResult = "0 KB = 0 MB and 0 KB";
        String result = MegaBytesConverter.printMegaBytesAndKiloBytes(kiloBytes);
        assertEquals(myResult, result);
    }
}
