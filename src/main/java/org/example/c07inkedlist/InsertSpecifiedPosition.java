package org.example.c07inkedlist;

import java.util.LinkedList;

/*
Write a Java program to insert some elements at the specified position into a linked list.
 */
public class InsertSpecifiedPosition {
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
        list.add(2, "wawwwwww");
        list.add(5, "oooooooooo");
        System.out.println("List after inserting " + list);
    }
}
