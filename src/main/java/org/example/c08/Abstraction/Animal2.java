package org.example.c08.Abstraction;
/*
Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a
specific sound for each animal.
 */
public abstract class Animal2 {
    public abstract void sound();
}
class Lion extends Animal2{

    @Override
    public void sound() {
        System.out.println("Lion roar's is terrible");
    }
}
class Tiger extends Animal2{

    @Override
    public void sound() {
        System.out.println("Tiger roar is funny");
    }
}
