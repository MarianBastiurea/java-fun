package org.example.c07linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/*
 Write a Java program to iterate a linked list in reverse order.
 */
public class IterateReverse {
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
      Iterator color = list.descendingIterator();
        while (color.hasNext()) {
            System.out.println(" color is " + color.next());
        }
    }
}
