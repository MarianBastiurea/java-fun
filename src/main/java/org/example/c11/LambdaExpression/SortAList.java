package org.example.c11.LambdaExpression;
import java.util.*;
import java.util.List;

//Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
public class SortAList {
    public static void main(String[] args) {
        List<Student> student_list = new ArrayList<>();
        student_list.add(new Student("Adriana Jamie", 15, "X"));
        student_list.add(new Student("Felix Uisdean", 15, "X"));
        student_list.add(new Student("Conceicao Palmira", 14, "X"));
        student_list.add(new Student("Jair Camila", 14, "X"));
        student_list.add(new Student("Micaela Rosana", 15, "X"));
        System.out.println("Student details:");
        for (Student Student : student_list) {
            System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
        }
        student_list.sort(Comparator.comparing(Student::getName));
        System.out.println("\nSorted list based on Student Name:");
        for (Student Student : student_list) {
            System.out.println(Student.getName() + " - " + Student.getAge() + " - " + Student.getSClass());
        }
    }
}

class Student {
    private String name, SClass;
    private int age;

    public Student(String name, int age, String SClass) {
        this.name = name;
        this.age = age;
        this.SClass = SClass;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSClass() {
        return SClass;
    }
}

