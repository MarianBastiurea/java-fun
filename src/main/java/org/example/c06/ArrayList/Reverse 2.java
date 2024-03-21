package org.example.c06.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("old ArrayList " + numbers + " ");
        Collections.reverse(numbers);
        System.out.println("new ArrayList " + numbers + " ");
    }
}