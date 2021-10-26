package edu.wctc;


public class Player {

    private PlayerHand hand;

    public Player() {
        hand = new PlayerHand();
    }

    public String showHand() {
        return hand.toString();
    }
}
