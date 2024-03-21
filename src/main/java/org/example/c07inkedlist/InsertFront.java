package org.example.c07inkedlist;

import java.util.LinkedList;

/*
Write a Java program to insert the specified element at the front of a linked list.
 */
public class InsertFront {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println("List before inserting " + list);
        list.offerFirst("Rainbow colors are");
        System.out.println("List after inserting " + list);
    }
}
