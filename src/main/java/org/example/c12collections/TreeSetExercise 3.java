package org.example.c12collections;

import java.util.*;

public class TreeSetExercise {

    public static void main(String[] args) {
        //Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");
        System.out.println("Rainbow colors:" + colors);

        //Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> multipleColors = new TreeSet<>();
        multipleColors.add("Black");
        multipleColors.add("White");
        System.out.println("initial multipleColors TreeSet: " + multipleColors);
        multipleColors.addAll(colors);
        System.out.println(" multipleColors TreeSet after add colors list: " + multipleColors);

        //Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator p = multipleColors.descendingIterator();
        System.out.println("multipleColors in reverse order:");
        while (p.hasNext()) {
            System.out.print(p.next() + " ");
        }

        //Write a Java program to get the first and last elements in a tree set.
        System.out.println();
        System.out.println("First element in multipleColors:" + multipleColors.first());
        System.out.println("Last element in multipleColors:" + multipleColors.last());

        //Write a Java program to find numbers less than 7 in a tree set.
        TreeSet<Integer> number = new TreeSet<>();
        number.add(1);
        number.add(2);
        number.add(10);
        number.add(6);
        number.add(4);
        number.add(7);
        number.add(8);
        System.out.println(number);
        TreeSet<Integer> numberLessThan7;
        numberLessThan7 = (TreeSet) number.headSet(7);
        Iterator q = numberLessThan7.iterator();
        System.out.println("TreeSet list with number less than 7:");
        while (q.hasNext()) {
            System.out.print(q.next() + " ");
        }

        // Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        Integer greaterOrEqual = number.ceiling(4);
        System.out.println();
        if (greaterOrEqual != null) {
            System.out.println("Elements greater than or equal to " + 4 + ":");
            for (Integer element : number.tailSet(greaterOrEqual)) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("No element found greater than or equal to " + 4);
        }

        //Write a Java program to remove a given element from a tree set.

        multipleColors.remove("White");
        System.out.println();
        System.out.println("multipleColors TreeSet after removing white color:" + multipleColors);

    }
}
