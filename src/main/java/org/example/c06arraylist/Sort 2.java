package org.example.c06arraylist;
import java.util.*;
/*
Write a Java program to sort a given array list.
 */
public class Sort {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(7);
        numbers.add(6);
        numbers.add(0);
        System.out.println("before "+numbers);
        System.out.println();
        Collections.sort(numbers);
        System.out.println("after "+ numbers);
    }
}
