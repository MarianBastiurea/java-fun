package org.example.c02.controlFlow;

public class PrimeNumbersCounter {
    public static int[] countPrimeNumbers(int lower, int upper) {
        int countNumber = 0;
        int[] primeNumber = new int[3];
        for (int i = lower; countNumber < 3 && i <= upper; i++) {
            if (isPrime(i)) {
                primeNumber[countNumber] = i;
                countNumber++;
            }
        }
        return primeNumber;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
