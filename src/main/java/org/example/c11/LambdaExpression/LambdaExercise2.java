package org.example.c11.LambdaExpression;

import java.util.*;
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

       List<String> str3 = Arrays.asList("Red", "Green", "ORANGE");
       System.out.println("Initial list of string is: "+str3);
       // change all list of strings to lowercase
        str3.replaceAll(str->
        str.toLowerCase());
        System.out.println("List of string converted to lowercase: "+str3);

        // change all list of strings to uppercase
        str3.replaceAll(str->
                str.toUpperCase());
        System.out.println("change all list of string to uppercase"+str3);

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

    }


}

