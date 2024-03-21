package org.example.c07.linkedList;

import java.util.LinkedList;

/*
 Write a Java program to insert the specified element at the specified position in the linked list.
 */
public class Insert {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println("Original List:  " + list);
        list.add(0, "Rainbow colors are:");
        System.out.println("List after insertion :  " + list);
    }
}
