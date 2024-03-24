package org.example.c16regularexpression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;

public class Exercises {

    public static void main(String[] args) {

        // Write a Java program to check whether a string contains only a certain set of characters
        // (in this case a-z, A-Z and 0-9).
        List<String> colors = Arrays.asList("red", "yellow", "green", "violet", "indigo", "black",
                "white", "blue", "orange");
        List<String> nonCharacters = Arrays.asList("!$#*", "*&^", "#$%^&*");
        for (String s : colors) {
            System.out.println("colors list contains a-z, A-Z and 0-9 characters? " + s + "-> " +
                    s.matches("^[\\w]+$"));
        }
        for (String s : nonCharacters) {
            System.out.println("nonCharacters list contains a-z, A-Z and 0-9 characters? " + s + "-> " +
                    s.matches("^[\\w]+$"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program that matches a string that has a p followed by zero or more q's.
        List<String> pString = Arrays.asList("p", "ksdfjshdbjf", "pq", "pqqqqqqqq", "hebch");
        for (String s : pString) {
            System.out.println("String: " + s + " have a p followed by zero or more q's?" +
                    s.matches("pq*"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program to find sequences of lowercase letters joined by an underscore.
        List<String> colorsUnderscore = Arrays.asList("red_yellow", "green", "violet_indigo", "black",
                "white", "blue_orange", "H_L", "H_l");
        for (String s : colorsUnderscore) {
            System.out.println(s + "have lowercase letters joined by an underscore->" + s.matches("^[a-z]+_[a-z]+$"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program to find the sequence of one upper case letter followed by lower case letters.?
        List<String> upperLower=Arrays.asList("fdgUmn","Up","fdgfasD","jjkggkgh");
        for(String s:upperLower){
            System.out.println(s+" have a sequence of one upper case letter followed by lower case letters ->"+
                   // s.matches("[A-Z][a-z]+$"));
                    s.matches("\\w*[A-Z][a-z]\\w*"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program that matches a string with a 'p' followed by anything ending in 'q'.
        List<String> pAnythingQ=Arrays.asList("vgvhgvjghvg", "hgpbbvvq","phgfdq","fffffff", "gjhryus","fgdg?dgf","4jdnv");
        for (String s:pAnythingQ){
            System.out.println(s+" have a 'p' followed by anything ending in 'q'? ->"+s.matches("p.*?q$"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program to check if a word contains the character 'g' in a given string.
        for(String s:pAnythingQ){
            System.out.println(s+" contains 'g'? ->"+s.matches("\\w*g.\\w*"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program that matches a word containing 'g', not at the start or end of the word
        Pattern pattern = Pattern.compile("\\Bg\\B");
        for(String s:pAnythingQ){
            Matcher m = pattern.matcher(s);
            System.out.println(s+" contain 'g', not at the start or end of the word? -> "+m.find());
        }
        System.out.println("_".repeat(30));

        //Write a Java program to match a string containing only upper and lowercase letters, numbers, and underscores.
        Pattern patternA = Pattern.compile("^[a-zA-Z0-9_]*$");
        for(String s:pAnythingQ){
            Matcher m = patternA.matcher(s);
            System.out.println(s+" only upper and lowercase letters, numbers, and underscores? -> "+m.find());
        }
        System.out.println("_".repeat(30));

        //Write a Java program where a string starts with a specific number.
        Pattern pattern4 = Pattern.compile("^4.*$");
        for(String s:pAnythingQ){
            Matcher m = pattern4.matcher(s);
            System.out.println(s+" only upper and lowercase letters, numbers, and underscores? -> "+m.find());
        }
        System.out.println("_".repeat(30));

        //Write a Java program to remove leading zeros from a given IP address.
        List<String> ipAddress=Arrays.asList("216.08.094.196","08.008.0008.00008","01.102.103.104");
        for(String s:ipAddress){
            System.out.println(s+"if starts with 0 will be replaced by A ->"+s.replaceAll("(?<=^|\\.)0+(?!\\.|$)","A"));
        }
        System.out.println("_".repeat(30));

        //Write a Java program to check for a number at the end of a string.
        for(String s:ipAddress){
            System.out.println(s+" have 8 at the end of string? ->"+s.matches(".*8$"));
        }
        System.out.println("_".repeat(30));



    }
}
