package org.example.c07.LinkedList;


import java.util.Collection;
import java.util.LinkedList;

public class General {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        /*list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println(" Original" + list);*/
        buildList();
        firstAndLastOccurrenceOfASpecifiedElement(list);
        displayElementsAndTheirPosition(list);
        removeElementsAtSpecifiedPosition(list, 2);
        removeFirstAndLastElements(list);
        removeAllElements(list);
        swapElements(list, "Red", "Violet");
    }

    public static LinkedList buildList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Indigo");
        list.add("Violet");
        System.out.println(" Original" + list);
        return list;
    }

    public static void firstAndLastOccurrenceOfASpecifiedElement(LinkedList list) {

        //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        buildList();
        list.add("Red");
        System.out.println("First occurrence of red is a position " + list.indexOf("Red"));
        System.out.println("Last occurrence of red is a position " + list.lastIndexOf("Red"));
    }

    public static void displayElementsAndTheirPosition(LinkedList list) {

        //   Write a Java program to display elements and their positions in a linked list.

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.size());
            System.out.println("Colour at position " + i + " is " + list.get(i));
        }
    }

    public static void removeElementsAtSpecifiedPosition(LinkedList list, int position) {
        //  Write a Java program to remove a specified element from a linked list.
        list.remove(position);
        System.out.println("New list after removing element from position " + position + "is:");
        System.out.println(list);
    }

    public static void removeFirstAndLastElements(LinkedList list) {
        //Write a Java program to remove the first and last elements from a linked list.
        list.removeFirst();
        list.removeLast();
        System.out.println("New list after removing first and last elements is");
        System.out.println(list);
    }

    public static void removeAllElements(LinkedList list) {
        //Write a Java program to remove all elements from a linked list.
        list.clear();
        System.out.println("New list after removing all elements is");
        System.out.println(list);
    }

    public static void swapElements(LinkedList list, String s1, String s2) {
        //Write a Java program that swaps two elements in a linked list.
        String temp = "";
        int i = list.indexOf(s1);
        int j = list.indexOf(s2);
        list.add(i, s2);
        list.add(j, s1);
        System.out.println("New list after swapping " + s1 + " with " + s2);
        System.out.println(list);
    }
}
