package org.example.c07inkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/*
Write a Java program to iterate through all elements in a linked list.
 */
public class Iterate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println(list);
        Iterator color = list.listIterator(1);
        while (color.hasNext()) {
            System.out.println(" color is " + color.next());
        }
    }
}
