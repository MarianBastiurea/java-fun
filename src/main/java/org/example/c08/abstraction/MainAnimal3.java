package org.example.c08.abstraction;

public class MainAnimal3 {
    public static void main(String[] args) {
        Lion3 lion = new Lion3();
        lion.eat();
        lion.sleep();
        Tiger3 tiger = new Tiger3();
        tiger.eat();
        tiger.sleep();
        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
