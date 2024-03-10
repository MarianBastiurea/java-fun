package org.example.c11.LambdaExpression;

import java.util.stream.IntStream;
import java.util.function.IntPredicate;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int start = 100;
        int end = 200;

        int sum = calculatePrimeSum(start, end);
        System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + sum);
    }

    public static int calculatePrimeSum(int start, int end) {
        IntPredicate isPrime = n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
        return IntStream.rangeClosed(start, end)
                .filter(isPrime)
                .sum();
    }
}

