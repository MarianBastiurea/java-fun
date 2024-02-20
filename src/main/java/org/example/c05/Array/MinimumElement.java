package org.example.c05.Array;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int count = readInteger();
        int[] elements = readElements(count);
        int min = findMin(elements);
        System.out.println("Minimum value in the array: " + min);
    }
    private static int readInteger() {
        System.out.println("Enter the number of elements:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Method to read elements from the console and return them in an array
    private static int[] readElements(int count) {
        int[] elements = new int[count];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    // Method to find the minimum value in an array
    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
