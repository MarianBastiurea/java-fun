package org.example.c12.Collections;

import java.util.*;


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
        System.out.println("Array of colors:");
        Arrays.stream(colorsArray).map(s -> " " + s).forEach(System.out::println);

        //Write a Java program to convert a hash set to a tree set.
        System.out.println("TreeSet elements are: ");
        Set<String> colorsSet = new TreeSet<String>(colorsClone);
        colorsSet.forEach(System.out::println);

        //Write a Java program to find numbers less than 7 in a tree set.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(10);
        numbers.add(6);
        System.out.println("first numbers list is: " + numbers);
        System.out.println("numbers lower than 7 are:");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.println(num);
            }
        }

        //Write a Java program to compare two hash set.
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(11);
        numbers1.add(61);
        System.out.println("Second list of number: " + numbers1);
        System.out.println("compare first list with second list of numbers:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
            System.out.println(numbers1.contains(num) ? "Yes" : "No");
        }

        //Write a Java program to compare two sets and retain elements that are the same.
        Set<Integer> sameNumber = new HashSet<>(numbers);
        sameNumber.retainAll(numbers1);
        System.out.println("same number in both list: " + sameNumber);


    }
}
