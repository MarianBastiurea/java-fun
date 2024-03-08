package org.example.c11.LambdaExpression;

import java.util.*;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;


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

        List str3 = Arrays.asList("red", "Green", "ORANGE");
        str3.replaceAll(str3.get(0)->
          str3.get(0).toLowerCase();
        System.out.println("change"+str3.get(0)+"from lowercase to uppercase"+ ;

        str3.replaceAll(str -> str.toLowerCase());




    }

    }
}
