package org.example.c06.arrayList;

import java.util.ArrayList;

/*
Write a Java program to print all the elements of an ArrayList using the elements' position.
 */
public class Print {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i + 10);
        }
        System.out.print("ArrayList is " + numbers + " ");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("element at position " + i + " is " + numbers.get(i));
        }
    }
}
