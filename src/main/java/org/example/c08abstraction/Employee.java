package org.example.c08abstraction;

/*
Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to
calculate salary and display information for each role.
 */
public abstract class Employee {
    abstract double calculateSalary();

    abstract String displayInfo();
}

class Manager extends Employee {
    double hourlySalary;
    double timeSheet;
    int badgeNumber;
    String firstName;
    String lastName;

    public Manager(double hourlySalary, double timeSheet, int badgeNumber, String firstName, String lastName) {
        this.hourlySalary = hourlySalary;
        this.timeSheet = timeSheet;
        this.badgeNumber = badgeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    double calculateSalary() {
        return hourlySalary * timeSheet;
    }

    @Override
    String displayInfo() {
        return "Manager{" +
                "badgeNumber=" + badgeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class Programmer extends Employee {
    double hourlySalary;
    double timeSheet;
    int badgeNumber;
    String firstName;
    String lastName;

    public Programmer(double hourlySalary, double timeSheet, int badgeNumber, String firstName, String lastName) {
        this.hourlySalary = hourlySalary;
        this.timeSheet = timeSheet;
        this.badgeNumber = badgeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    double calculateSalary() {
        return hourlySalary * timeSheet;
    }

    @Override
    String displayInfo() {
        return "Manager{" +
                "badgeNumber=" + badgeNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
