package org.example.c05.Array;
import java.util.*;
public class SortExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        int[] integers = getIntegers(count);
        System.out.println("Entered integers:");
        printArray(integers);
        int[] sortedIntegers = sortIntegers(integers);
        System.out.println("Sorted integers in descending order:");
        printArray(sortedIntegers);
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        // Copy the original array to avoid modifying it
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        // Perform a bubble sort in descending order
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - 1 - i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    // Swap elements
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
