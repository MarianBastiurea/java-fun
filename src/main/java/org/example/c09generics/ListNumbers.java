package org.example.c09generics;

import java.util.List;

public class ListNumbers {
    public static <T extends Number> void calculateNumberSum(List<T> numbers) {
        double evenSum = 0;
        double oddSum = 0;
        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("Original list of numbers:" + numbers);
        System.out.println("Sum of even number is " + evenSum);
        System.out.println("Sum of odd number is " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
        calculateNumberSum(integers);
        calculateNumberSum(doubles);
    }
}
