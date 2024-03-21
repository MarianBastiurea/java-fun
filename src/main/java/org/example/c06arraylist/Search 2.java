package org.example.c06arraylist;

import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.print(numbers + " ");
        int number = 3;
        int position=0;
        for (Integer element : numbers) {
            if (number == numbers.get(element)) {
                position=element;
                break;
            }
        }
        System.out.println("number " + number + " found at position " + position);
    }
}
