package org.example.c06.arrayList;

import java.util.ArrayList;

/*
Write a Java program to create an array list, add some colors (strings) and print out the collection
 */
public class Colors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("black");
        System.out.println(colors);
    }
}
