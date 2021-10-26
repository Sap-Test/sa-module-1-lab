package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class PlayerHand {

    public List<Card> cards;

    public PlayerHand() {
        cards = new ArrayList<>();

        int HANDSIZE = 5;
        for (int i = 0; i < HANDSIZE; i++) {
            cards.add(new Card());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card c : cards)
            sb.append(c.toString()).append("\n");
        return sb.toString();
    }
}
