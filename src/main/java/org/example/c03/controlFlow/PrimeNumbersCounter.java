package org.example.c03.controlFlow;

public class PrimeNumbersCounter {
    public static int[] countPrimeNumbers(int lower, int upper) {
        int countNumber = 0;
        int[] temporaryPrimeNumberArray = new int[upper - lower];
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                temporaryPrimeNumberArray[countNumber] = i;
                countNumber++;
                if (countNumber==3)
                    break;
            }
        }
        int[] primeNumber = new int[countNumber];
        for (int i = 0; i < countNumber; i++) {
            primeNumber[i] = temporaryPrimeNumberArray[i];
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
