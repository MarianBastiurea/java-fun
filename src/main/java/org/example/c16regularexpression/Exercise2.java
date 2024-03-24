package org.example.c16regularexpression;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        //Write a Java program to count the number of vowels in a given string using a regular expression
        List<String> words = Arrays.asList("mother", "oral", "aaaaaaaaaa", "hnbjkm");
        for (String s : words) {
            System.out.println(s + " contains " + s.replaceAll("[^aeiouAEIOU]", "").length() + " vowels");
        }
        System.out.println("__".repeat(30));

        //Write a Java program to remove all vowels from a given string. Return the updated string
        for (String s : words) {
            System.out.println(s + " with all vowels removed " + s.replaceAll("(?i)[aeiou]", ""));
        }
        System.out.println("__".repeat(30));

        //Write a Java program to add a dash before and after every vowel in a given string.
        for (String s : words) {
            System.out.println(s + " with all vowels removed " + s.replaceAll("([AEIOUaeiou])", "-$1-"));
        }
        System.out.println("__".repeat(30));
    }
}
