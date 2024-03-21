package org.example.c06arraylist;

import java.util.ArrayList;

/*
Write a Java program to empty an array list.
 */
public class Empty {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.print("ArrayList is " + numbers + " ");
        System.out.println();
        numbers.clear();
        System.out.print("Empty ArrayList is: " + numbers + " ");
    }
}
