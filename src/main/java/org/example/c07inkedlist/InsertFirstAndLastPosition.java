package org.example.c07inkedlist;
/*
Write a Java program to insert elements into the linked list at the first and last positions.
 */

import java.util.LinkedList;

public class InsertFirstAndLastPosition {
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
        list.addFirst("Rainbow colors are");
        list.addLast("and are wonderful");
        System.out.println("List after inserting " + list);
    }
}
