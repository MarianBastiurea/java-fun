package org.example.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BarkingDogTest {
    @Test
    public void givenFalseAsBarkingAndNegative5AsHourShouldReturnFalse(){
        boolean barking=false;
        int hour=-5;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAndNegative1AsHourShouldReturnFalse(){
        boolean barking=true;
        int hour=-1;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenFalseAsBarkingAnd24AsHourShouldReturnFalse(){
        boolean barking=false;
        int hour=24;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd44AsHourShouldReturnFalse(){
        boolean barking=true;
        int hour=44;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenFalseAsBarkingAnd6AsHourShouldReturnFalse(){
        boolean barking=false;
        int hour=6;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd4AsHourShouldReturnTrue(){
        boolean barking=true;
        int hour=4;
        boolean isBarking=true;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd23AsHourShouldReturnTrue(){
        boolean barking=true;
        int hour=23;
        boolean isBarking=true;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd22AsHourShouldReturnFalse(){
        boolean barking=true;
        int hour=22;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd8AsHourShouldReturnFalse(){
        boolean barking=true;
        int hour=8;
        boolean isBarking=false;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd7AsHourShouldReturnTrue(){
        boolean barking=true;
        int hour=7;
        boolean isBarking=true;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
    @Test
    public void givenTrueAsBarkingAnd0AsHourShouldReturnTrue(){
        boolean barking=true;
        int hour=0;
        boolean isBarking=true;
        boolean result=BarkingDog.shouldWakeUp(barking,hour);
        assertEquals(isBarking,result);
    }
}
