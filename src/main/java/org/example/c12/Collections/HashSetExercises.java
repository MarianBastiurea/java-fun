package org.example.c12.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetExercises {
    public static void main(String[] args) {

        //Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Indigo");
        colors.add("Violet");
        System.out.println("Rainbow colors:" + colors);

        //Write a Java program to iterate through all elements in a hash list.
        Iterator<String> p = colors.iterator();
        // Iterate the hash set
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        //Write a Java program to get the number of elements in a hash set.
        System.out.println("Colors list size is: " + colors.size());

        //Write a Java program to clone a hash set to another hash set.
        HashSet<String> colorsClone = (HashSet) colors.clone();
        System.out.println("Colors clone list size is: " + colorsClone);

        //Write a Java program to empty an hash set.
        colors.removeAll(colors);
        System.out.println("Rainbow colors:" + colors);

        //Write a Java program to test if a hash set is empty or not.
        if (colors.isEmpty()) {
            System.out.println("Colors List is empty.");
        } else {
            System.out.println("Colors List is not empty");
        }

        //Write a Java program to convert a hash set to an array.
        String[] colorsArray = new String[colorsClone.size()];
        colorsClone.toArray(colorsArray);
        Arrays.stream(colorsArray).map(s -> "array colors are: " + s).forEach(System.out::println);

        //


    }
}
