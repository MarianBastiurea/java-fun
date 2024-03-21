package org.example.c06.arrayList;

import java.util.ArrayList;

/*
Write a Java program to test whether an array list is empty or not.
 */
public class IsEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("ArrayList is " + numbers + " ");
        int size = numbers.size();
        int size1 = numbers1.size();
        if (size > 0) {
            System.out.println("Size of ArrayList numbers is: " + size);
        } else System.out.println("ArrayList is empty");
        if (size1 > 0) {
            System.out.println("Size of ArrayList numbers1 is: " + size1);
        } else System.out.println("ArrayList numbers1 is empty");
    }
}
