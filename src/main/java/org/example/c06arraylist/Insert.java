package org.example.c06arraylist;

import java.util.ArrayList;

/*
 Write a Java program to insert an element into the array list at the first position.
 */
public class Insert {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0; i<10; i++){
            numbers.add(i);
        }
        System.out.print(numbers+" ");
        numbers.add(0,100);
        System.out.print(numbers+" ");
    }
}
