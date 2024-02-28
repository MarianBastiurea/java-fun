package org.example.c06.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
Write a Java program that swaps two elements in an array list.
 */
public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("ArrayList before swapping " + numbers + " ");
        Collections.swap(numbers, 2, 0);
        System.out.println("ArrayList after swapping " + numbers + " ");
    }
}
