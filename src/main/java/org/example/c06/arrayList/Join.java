package org.example.c06.arrayList;
/*
Write a Java program to join two array lists.
 */

import java.util.*;

public class Join {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("first ArrayList " + numbers);
        for (int i = 10; i < 21; i++) {
            numbers1.add(i);
        }
        System.out.println("second ArrayList " + numbers1);
        numbers.addAll(numbers1);
        System.out.println("Joined ArrayList " + numbers);
    }
}
