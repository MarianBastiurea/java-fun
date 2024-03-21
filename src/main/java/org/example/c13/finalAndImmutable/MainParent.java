package org.example.c13.finalAndImmutable;

public class MainParent {
    public static void main(String[] args) {

        Parent parent = new Parent("Jane Doe", "01/01/1950", 4);
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);
        Person1 joe = new Person1("Joe", "01-01-1950");
        System.out.println(joe);

        Person1 joeCopy = new Person1(joe);
        System.out.println(joeCopy);
        Generation g = Generation.BABY_BOOMER;
    }
}
