package org.example.c06.ArrayList;

import java.util.ArrayList;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Retrieve {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.print(numbers + " ");
        System.out.println();
        int element = numbers.get(0);
        System.out.println(element);
    }
}
