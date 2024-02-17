package org.example.c02.controlFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaintJobTest {
    @Test
    public void givenNegative3Point4AsWidth2Point1AsHeight1Point5AsAreaPerBucket2ExtraBucketShouldReturnNegative1() {
        double width = -3.4;
        double height = 2.1;
        double areaPerBucket = 1.5;
        int extraBucket = 2;
        double myResult = -1;
        double result = PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket);
        assertEquals(myResult, result);
    }

    @Test
    public void given3Point4AsWidth2Point1AsHeight1Point5AsAreaPerBucket2ExtraBucketShouldReturn3() {
        double width = 3.4;
        double height = 2.1;
        double areaPerBucket = 1.5;
        int extraBucket = 2;
        double myResult = 3;
        double result = PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket);
        assertEquals(myResult, result);
    }

    @Test
    public void given2Point75AsWidth3Point25AsHeight2Point5AsAreaPerBucket1ExtraBucketShouldReturn3() {
        double width = 2.75;
        double height = 3.25;
        double areaPerBucket = 2.5;
        int extraBucket = 1;
        double myResult = 3;
        double result = PaintJob.getBucketCount(width, height, areaPerBucket, extraBucket);
        assertEquals(myResult, result);
    }

    @Test
    public void given3Point4AsAreaAnd1Point5AsAreaPerBucketShouldReturn3ExtraBucketNeeded() {
        double area = 3.4;
        double areaPerBucket = 1.5;
        double extraBucketNeeded = 3;
        double result = PaintJob.getBucketCount(area, areaPerBucket);
        assertEquals(extraBucketNeeded, result);
    }

    @Test
    public void givenNegative3Point4AsWidth2Point1AsHeight1Point5AsAreaPerBucketShouldReturnNegative1() {
        double width = -3.4;
        double height = 2.1;
        double areaPerBucket = 1.5;
        int numberOfBucketsNeeded = -1;
        int result = PaintJob.getBucketCount(width, height, areaPerBucket);
        assertEquals(numberOfBucketsNeeded, result);
    }
}
