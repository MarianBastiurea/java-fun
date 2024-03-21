package org.example.c11lambdaexpression;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.Comparator;


@FunctionalInterface
interface WordCounter {
    int countWords(String text);
}

public class LambdaExercise3 {
    public static void main(String[] args) {
        //Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
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

        //Write a Java program to implement a lambda expression to count words in a sentence.
        String text = "Java lambda expression.";
        System.out.println("Original string: " + text);
        WordCounter wordCounter = s -> s.split("\\s+").length;
        int ctr = wordCounter.countWords(text);
        System.out.println("Word count: " + ctr);

        //Write a Java program to implement a lambda expression to check if a given string is a palindrome.
        Predicate<String> isPalindrome = str -> {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        // Check if a string is a palindrome using the lambda expression
        String word1 = "Madam";
        boolean isPalindromeResult1 = isPalindrome.test(word1);
        String word2 = "radar";
        boolean isPalindromeResult2 = isPalindrome.test(word2);
        System.out.println(word1 + " is a palindrome? " + isPalindromeResult1);
        System.out.println((word2) + " is palindrome? " + isPalindromeResult2);

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

        //Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
        List<String> colors = Arrays.asList("red", "yellow", "green", "violet", "indigo", "black", "white", "blue", "orange");
        String searchColor = "black";
        Predicate<String> containsWord = word -> word.equals(searchColor);
        boolean flag = colors.stream().anyMatch(containsWord);
        System.out.println("List of colors: " + colors);
        System.out.println("red is colors list: " + flag);

        //Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
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

        //Write a Java program to implement a lambda expression to check if a given number is a perfect square.
        int number1 = 4;
        int number2 = 5;
        Predicate<Integer> isPerfectSquare = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (i * i == n) {
                    return true;
                }
            }
            return false;
        };
        System.out.println("the number " + number1 + " is perfect square?" + isPerfectSquare.test(number1));
        System.out.println("the number " + number2 + " is perfect square?" + isPerfectSquare.test(number2));

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

    }
}
