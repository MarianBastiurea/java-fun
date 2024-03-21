package org.example.c06.arrayList;

import java.util.*;


public class Compare {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("first ArrayList " + numbers + " ");
        for (int i = 0; i < 10; i++) {
            numbers1.add(i);
        }
        System.out.println("second ArrayList " + numbers1 + " ");
        for (int i = 10; i < 20; i++) {
            numbers2.add(i);
        }
        System.out.println("third ArrayList " + numbers2 + " ");
        boolean result=true;
        boolean result1=true;
        System.out.println(result);
        if (numbers1.equals(numbers)){
            System.out.println("ArrayList numbers and number1 are equal");
        }
        if (!numbers1.equals(numbers2)){
            System.out.println("ArrayList numbers2 and number1 aren't equal");
        }
    }
}
