package org.example.c09.Generics;

import java.util.*;


/*
Write a Java program to create a generic method that takes a list of any type and a target element.
It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot
 be found.
 */
public class Target {
    public static <T> int findElementPosition(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5);
        List<String> listString = List.of("red", "green", "yellow");
        System.out.println("Target 5 was found at position: " + findElementPosition(listNumbers, 5));
        System.out.println("Target 7 wasn't found and method will return " + findElementPosition(listNumbers, 7));
        System.out.println("Target red is found at position: " + findElementPosition(listString, "red"));
    }
}
