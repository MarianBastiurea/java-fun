package org.example.c03.controlFlow;

public class SumOfFirst5NumbersDividedBy15 {
    public static int[] findNumbers(int lower, int upper) {
        int[] result = new int[5];
        int count = 0;
        for (int i = lower; count < 5 && i < upper; i++) {
            if (isDivisibleBy15(i)) {
                result[count] = i;
                count++;
            }
        }
        return result;
    }

    public static boolean isDivisibleBy15(int number) {
        return number % 15 == 0;
    }

    public static int findSum(int[] result) {
        int sum = 0;
        for (int j : result) {
            sum += j;
        }
        return sum;
    }
}
