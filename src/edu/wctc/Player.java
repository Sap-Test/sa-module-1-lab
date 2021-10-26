package edu.wctc;


public class Player {

    private PlayerHand hand;
    int HANDSIZE = 5;

    public Player() {
        hand = new PlayerHand(HANDSIZE);
    }

    public String showHand() {
        return hand.toString();
    }
}
