package org.example.c11lambdaexpression;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaExercise2 {

    public static void main(String[] args) {
        //Write a Java program to implement a lambda expression to find the sum of two integers.
        int a = 10, b = 15;
        SumCalculator SumCalculator = (x, y) -> x + y;
        int result = SumCalculator.sum(a, b);
        System.out.println(result);
        System.out.println("sum of a=10 and b=15 is: " + SumCalculator.sum(a, b));

        //Write a Java program to implement a lambda expression to check if a given string is empty.
        Predicate<String> isEmptyString = str -> str.isEmpty();
        String str1 = "";
        String str2 = "1";
        System.out.println("String is empty?" + isEmptyString.test(str1));
        System.out.println("String is empty?" + isEmptyString.test(str2));

        //Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        List<String> str3 = Arrays.asList("Red", "Green", "ORANGE", "yellow", "BLACK", "white");
        System.out.println("Initial list of string is: " + str3);
        // change all list of strings to lowercase
        str3.replaceAll(str ->
                str.toLowerCase());
        System.out.println("List of string converted to lowercase: " + str3);

        // change all list of strings to uppercase
        str3.replaceAll(str ->
                str.toUpperCase());
        System.out.println("change all list of string to uppercase" + str3);

        //Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.`
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listEven = list1.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers are:" + listEven);
        List<Integer> listOdd = list1.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers are:" + listOdd);

        //Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
        System.out.println("Initial list of string is: " + str3);
        str3.sort((str11, str12) -> str11.compareToIgnoreCase(str12));
        System.out.println("Sorted list of string is: " + str3);

        //Write a Java program to implement a lambda expression to find the average of a list of doubles.
        List<Double> list2 = Arrays.asList(1.2, 2.5, 4.8, 9.2, 7.5);
        System.out.println("List of double: " + list2);
        double average = list2.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average of a list of double is: " + average);

        //Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
        List<Integer> list3 = Arrays.asList(1, 4, 6, 3, 1, 5, 7, 4, 9, 8, 3, 10);
        System.out.println("Initial list:" + list3);
        List<Integer> uniqueElements = new ArrayList<>();
        list3.stream()
                .distinct()
                .forEach(uniqueElements::add);
        System.out.println("Unique elements list is: " + uniqueElements);

        //Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
        int number = 6;
        LongUnaryOperator factorial = n -> {
            long result1 = 1;
            for (long i = 1; i <= n; i++) {
                result1 *= i;
            }
            return result1;
        };
        long factorialResult = factorial.applyAsLong(number);
        System.out.println("Factorial of " + number + " is " + factorialResult);

        //Write a Java program to implement a lambda expression to create a lambda expression to check if a number is
        // prime.
        int number1 = 8;
        int number2 = 7;
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        boolean isPrimeResult1 = isPrime.test(number1);
        System.out.println("number " + number1 + " is prime? " + isPrimeResult1);
        boolean isPrimeResult2 = isPrime.test(number2);
        System.out.println("number " + number1 + " is prime? " + isPrimeResult2);

        //Write a Java program to implement a lambda expression to concatenate two strings.
        BiFunction<String, String, String> concatenate = (str13, str14) -> str13 + " " + str14;
        String str4 = "Good";
        String str5 = "Morning";
        String str6 = concatenate.apply(str4, str5);
        System.out.println("result of concatenate " + str4 + " and " + str5 + " is " + str6);
    }
}

