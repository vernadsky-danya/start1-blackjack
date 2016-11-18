package com.company;

/**
 * Created by student1 on 14.11.16.
 */
public class Dealer extends Computer{

    private Deck deck = new Deck();

    public void deal(Player player) {
        Card current = deck.pop();
        player.take(current);

    }
}
