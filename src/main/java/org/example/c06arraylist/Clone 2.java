package org.example.c06arraylist;
/*
Write a Java program to clone an array list to another array list.
 */

import java.util.*;

public class Clone {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList numbers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("first ArrayList " + numbers);
        numbers1 = (ArrayList) numbers.clone();
        System.out.println("clone ArrayList " + numbers1);
    }
}
