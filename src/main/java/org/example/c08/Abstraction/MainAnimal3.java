package org.example.c08.Abstraction;

public class MainAnimal3 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
