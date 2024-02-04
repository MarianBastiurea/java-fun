package org.example.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeenNumberCheckerTest {
    @Test
    public void givenNegative2And9And99ShouldReturnFalse(){
        int age1=-2;
        int age2=9;
        int age3=99;
        boolean isTeenager=false;
        boolean result=TeenNumberChecker.hasTeen(age1,age2,age3);
        assertEquals(isTeenager,result);
    }
    @Test
    public void given14And3And7ShouldReturnTrue(){
        int age1=14;
        int age2=3;
        int age3=7;
        boolean isTeenager=true;
        boolean result=TeenNumberChecker.hasTeen(age1,age2,age3);
        assertEquals(isTeenager,result);
    }
}
