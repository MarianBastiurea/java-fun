package org.example.c04polymorphism;

public class MainPlayer {
    public static void main(String[] args) {

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,
                "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());

    }
}
