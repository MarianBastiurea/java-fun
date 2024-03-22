package org.example.c16regularexpression;

import java.util.List;

/*
Write a regular expression that matches the exact sentence "Hello, World!".
Use the matches method on String to check if the input sentence matches this pattern.
Use only literal characters in the regular expression.

Create a regular expression that matches a sentence starting with an uppercase letter, followed by zero or
more lowercase letters, and ending with a period.
For example, "The bike is red.", or, "I am a new student.", should match your regular expression.
The sentences "hello World." or "How are you?" should not.
Use the matches method to verify the pattern on each of these examples.

In this challenge, I want you to modify the requirements to Challenge 2 slightly, matching sentences that end in
different punctuation marks, but still maintain the other criteria.
In other words, The sentence should start with a word beginning with a capital letter, followed by one or more
words separated by spaces, and end with either an exclamation mark, question mark, or period.
In addition, punctuation marks within the sentence should be permitted, as are capital letters and abbreviations.
Modify your sentences to be
The bike is red, and has flat tires.
I love being a new L.P.A. student!
Hello, friends and family: Welcome!
How are you, Mary?



 */
public class ChallengeHelloWorld {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        boolean matches = sentence.matches("Hello, World!");
        System.out.println(matches);

        String challenge2 = "[A-Z].*//.";
        for (String s : List.of("The bike is red.",
                "I am a new student.",
                "hello world.",
                "How are you?")) {
            boolean matched = s.matches(challenge2);
            System.out.println(matched + ": " + s);
        }

        String challenge3 = "^[A-Z][\\p{all}]+[.?!]";
        for (String s : List.of("The bike is red, and has a flat tires.",
                "I love being a new L.P.A. student!",
                "Hello, friends and family: Welcome!",
                "How are you, Mary?")) {
            boolean matched = s.matches(challenge3);
            System.out.println(matched + ": " + s);
        }
    }
}
