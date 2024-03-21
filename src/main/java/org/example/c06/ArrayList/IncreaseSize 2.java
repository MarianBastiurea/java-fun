package org.example.c06.ArrayList;

import java.util.ArrayList;

/*
Write a Java program to increase an array list size.
 */
public class IncreaseSize {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("ArrayList is " + numbers + " ");
        numbers.add(10);
        System.out.print("New ArrayList is " + numbers + " ");
    }
}
