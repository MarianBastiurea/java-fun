package org.example.c08abstraction;
import java.util.*;
public class MainPlayer {
    public static void main(String[] args) {
        // Creating a Player object
        Player player = new Player("Tim", 10, 15);
        System.out.println("Player before saving: " + player);

        // Saving player's state
        List<String> playerData = player.write();

        // Modifying player's state
        player.setHitPoints(8);
        player.setStrength(12);
        System.out.println("Player after modifying: " + player);

        // Loading player's state
        player.read(playerData);
        System.out.println("Player after loading: " + player);

        // Creating a Monster object
        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println("Monster before saving: " + monster);

        // Saving monster's state
        List<String> monsterData = monster.write();

        // Modifying monster's state
        // (We are not modifying monster's state here, but you can do so if required)

        // Loading monster's state
        monster.read(monsterData);
        System.out.println("Monster after loading: " + monster);
    }
}
