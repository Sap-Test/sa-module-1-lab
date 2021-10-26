package edu.wctc;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Player 1:\n" + player1.showHand());
        System.out.println("Player 2:\n" + player2.showHand());
    }

}
