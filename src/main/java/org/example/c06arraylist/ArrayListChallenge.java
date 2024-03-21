package org.example.c06arraylist;

import java.util.*;

class MainItems {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> groceryList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Input 0 if you want to finish," +
                    "Input 1 If you want to add an item in list," +
                    "Input 2 if you want to remove an item from list: ");
            int option = s.nextInt();
            s.nextLine();
            switch (option) {
                case 0: {
                    System.out.println("you choose to finish grocery list." +
                            "Your grocery list is:");
                    System.out.println(groceryList);
                    running = false;
                    break;
                }
                case 1: {
                    System.out.println("you choose to add an item on your grocery list");
                    addItem();
                    break;
                }
                case 2: {
                    System.out.println("You chose to remove an item from the list");
                    removeItem();
                    break;
                }
                default: {
                    System.out.println("Invalid choice, please try again");
                }
            }
        }
    }

    private static void addItem() {
        System.out.println("Please enter item do you want to add to list");
        String item = scanner.nextLine();
        if (groceryList.contains(item)) {
            System.out.println("Item already exists in the list.");
        } else {
            groceryList.add(item);
            Collections.sort(groceryList);
            System.out.println("Item added.");
        }
        printList();
    }

    private static void removeItem() {
        System.out.println("Please enter item do you want to remove from list");
        String item = scanner.nextLine();
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found in the list.");
        }
        printList();
    }

    private static void printList() {
        System.out.println("Grocery List:");
        for (String item : groceryList) {
            System.out.println("- " + item);
        }
    }
}



