package org.example.c08.Abstraction;

/*
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods
 differently based on their specific behavior
 */
public abstract class Animal3 {
    abstract void eat();

    abstract void sleep();
}

class Lion extends Animal3 {

    @Override
    void eat() {
        System.out.println("Lion is carnivorous");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps few times daily");
    }
}

class Tiger extends Animal3 {

    @Override
    void eat() {
        System.out.println("Tiger is carnivorous");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps few times daily");
    }
}

class Deer extends Animal3 {

    @Override
    void eat() {
        System.out.println("Deer is herbivorous");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps few times daily");
    }
}
