package org.example.c12.Collections;


import java.util.List;

public class MainCard {

    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

    }
}

