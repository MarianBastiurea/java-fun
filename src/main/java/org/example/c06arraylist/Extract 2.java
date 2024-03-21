package org.example.c06arraylist;

import java.util.ArrayList;
import java.util.List;

public class Extract {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("old ArrayList " + numbers + " ");
        numbers1 = numbers.subList(0, 3);
        System.out.println("new ArrayList " + numbers1 + " ");
    }
}
