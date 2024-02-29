package org.example.c06.ArrayList;

import java.util.*;

/*
Write a Java program to iterate through all elements in an array list.
 */
public class Iterate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Integer element : list) {
            System.out.print(element+" ");
        }
    }
}
