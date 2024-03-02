package org.example.c07.LinkedList;

import java.util.LinkedList;

public class InsertEnd {
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
        list.offerLast("what a beautiful colors");
        System.out.println("List after inserting " + list);
    }
}
