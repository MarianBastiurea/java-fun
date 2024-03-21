package org.example.c06.arrayList;

import java.util.ArrayList;

/*
Write a Java program to remove the third element from an array list.
 */
public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.print(numbers + " ");
        System.out.println();
        numbers.remove(2);
        System.out.print(numbers + " ");
    }
}
