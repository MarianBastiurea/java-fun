package org.example.c09generics;

import java.util.*;

/*
Write a Java program to create a generic method that takes two arrays of the same type and checks
if they have the same elements in the same order.
 */
public class ArrayCompare {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        Integer[] arr3 = {2, 3, 4};
        Integer[] arr4 = {0, 0, 0, 0};
        System.out.println("First array is " + Arrays.toString(arr1));
        System.out.println("Second Array is " + Arrays.toString(arr2));
        System.out.println("Third Array is " + Arrays.toString(arr3));
        System.out.println("Fourth array is " + Arrays.toString(arr4));
        System.out.println("First and second are equal? " + compareArrays(arr1, arr2));
        System.out.println("First and third array are equal?" + compareArrays(arr1, arr3));
        System.out.println("First and fourth array are equal?" + compareArrays(arr1, arr4));
    }
}
