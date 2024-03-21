package org.example.c06arraylist;

import java.util.ArrayList;

public class Update {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.print(numbers + " ");
        System.out.println();
        numbers.set(0,100);
        System.out.println(numbers+" ");
    }
}
