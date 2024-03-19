package org.example.c14.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {
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

        //Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
        Optional<Integer> max = list1.stream()
                .max((x, y) -> x.compareTo(y));
        Optional<Integer> min = list1.stream()
                .min((x, y) -> x.compareTo(y));
        System.out.println("List is:" + list1);
        System.out.println("maximum is: " + max.orElse(null));
        System.out.println("minimum is: " + min.orElse(null));

        //Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
        int result1 = list1.stream()
                .reduce(1, (x, y) -> x * y)
                .intValue();
        int result2 = list1.stream()
                .reduce(0, (x, y) -> x + y)
                .intValue();
        System.out.println("multiply list is: " + result1);
        System.out.println("sum of list is: " + result2);

        //Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even
        // numbers in a list.
        int sumSquaresOdd = list1.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .sum();
        int sumSquaresEven = list1.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("Sum of square of odd number is: " + sumSquaresOdd);
        System.out.println("Sum of square of even number is: " + sumSquaresEven);


        //Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
        List<String> colors = Arrays.asList("red", "yellow", "green", "violet", "indigo", "black", "white", "blue", "orange");
        int maxLength = colors.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        System.out.println("length fo longest string is: " + maxLength);
        int minLength = colors.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println("length of smallest string is: " + minLength);

        //Write a Java program to implement a lambda expression to find the second largest and smallest
        // element in an array.
        Integer[] number = {1, 100, 7, 9, 89, 76, 5, 43};
        Integer secondLargest = Arrays.stream(number)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        Integer secondSmallest = Arrays.stream(number)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("arrays of integers: " + Arrays.toString(number));
        System.out.println("Second largest number in array is: " + secondLargest);
        System.out.println("Second smallest number in array is: " + secondSmallest);


        //Write a Java program to calculate the average of a list of integers using streams.
        Integer sum = Arrays.stream(number)
                .reduce(0, Integer::sum);
        double average = sum / number.length;
        System.out.println("Sum of elements from array: " + sum);
        System.out.println("Average of array's element: " + average);

        //Write a Java program to convert a list of strings to uppercase using streams.
        List<String> toUppercase = colors.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Colors in uppercase: " + toUppercase);

        //Write a Java program to remove all duplicate elements from a list using streams.
        List<String> colorsWithDuplicate = Arrays.asList("red", "yellow", "green", "violet", "indigo", "black",
                "white", "blue", "orange", "red", "yellow", "green", "violet", "indigo", "black");
        List<String> colorsWithoutDuplicate = colorsWithDuplicate.stream()
                .distinct()
                .toList();
        System.out.println("Colors list with duplicate: " + colorsWithDuplicate);
        System.out.println("Colors list without duplicate: " + colorsWithoutDuplicate);

        //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        List<String> words = Arrays.asList("red", "yellow", "green", "violet", "indigo", "row", "white",
                "blue", "orange", "rumble", "black");
        char startingLetter = 'r';
        long count = words.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("number of words starting with r:" + count);

        //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> wordsInAscendingOrder = words.stream()
                .sorted()
                .toList();
        System.out.println("words list sorted in ascending order" + wordsInAscendingOrder);

        List<String> wordsInDescendingOrder = words.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("words list in reverse order " + wordsInDescendingOrder);

    }
}
