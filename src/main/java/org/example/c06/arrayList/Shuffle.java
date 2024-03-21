package org.example.c06.arrayList;
import java.util.*;
public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("old ArrayList " + numbers + " ");
        Collections.shuffle(numbers);
        System.out.println("nee ArrayList " + numbers + " ");
    }
}
