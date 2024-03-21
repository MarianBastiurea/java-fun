package org.example.c09.Generics;

import java.util.*;

/*
Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list.
 This method alternates the elements of each list.
 */
public class MergeAndSort {
    public static <T> List<T> mergeAndAlternate(List<T> list1, List<T> list2) {
        List<T> resultList = new ArrayList<>();
        int min = Math.max(list1.size(), list2.size());
        for (int i = 0; i < min; i++) {
            if (i < list1.size()) {
                resultList.add(list1.get(i));
            }
            if (i < list2.size()) {
                resultList.add(list2.get(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);
        List<Integer> resultList = mergeAndAlternate(list1, list2);
        System.out.println("First list is: " + list1);
        System.out.println("Second list is:" + list2);
        System.out.println("Result list after merge and alternate elements is: " + resultList);
    }
}
