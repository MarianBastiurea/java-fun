package org.example.c06.arrayList;

import java.util.ArrayList;

/*
Write a Java program to replace the second element of an ArrayList with the specified element.
 */
public class Replace {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("ArrayList is " + numbers + " ");
        numbers.set(2, 900);
        System.out.print("New ArrayList is " + numbers + " ");
    }
}
