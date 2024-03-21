package org.example.c08abstraction;

public class MainEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager(200, 187, 123, "John", "Wayne");
        System.out.println(manager.displayInfo());
        System.out.println("On February 2024 " + manager.firstName + " " + manager.lastName + " earn "
                + manager.calculateSalary());
        Programmer programmer = new Programmer(100, 300, 456, "Benny",
                "Hill");
        System.out.println(programmer.displayInfo());
        System.out.println("On February 2024 " + programmer.firstName + " " + programmer.lastName + " earn " +
                programmer.calculateSalary());
    }
}
