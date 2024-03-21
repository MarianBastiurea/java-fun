package org.example.c06.arrayList;

import java.util.ArrayList;

/*
Write a Java program for trimming the capacity of an array list.
 */
public class Trimming {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("ArrayList is " + numbers + " ");
        numbers.trimToSize();
        System.out.println("After trimming to size ArrayList is " + numbers + " ");
    }
}
