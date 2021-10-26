package edu.wctc;

import java.util.Arrays;
import java.util.List;

public class Card {

    private final String suit;
    private final String face;

    private List<String> suits = Arrays.asList("hearts", "spades", "diamonds", "clubs");

    private List<String> faces = Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");

    public Card() {

        int randomSuit = (int) Math.floor(Math.random() * suits.size());
        int randomFace = (int) Math.floor(Math.random() * faces.size());

        suit= suits.get(randomSuit);
        face = faces.get(randomFace);
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
