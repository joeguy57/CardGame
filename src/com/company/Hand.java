package com.company;

import java.util.ArrayList;

public class Hand {
    private int size;
    private ArrayList<Card> myHand;

    /**
     * This constructor is in case handsizes are not fairly distributed
     *
     */
    public Hand(Deck newDeck, int handsize) {
        myHand = new ArrayList<>();
        for (int i = 0; i < handsize; i++) {
            myHand.add(newDeck.dealCard());
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Card> getMyHand() {
        return myHand;
    }

    public void setMyHand(ArrayList<Card> myHand) {
        this.myHand = myHand;
    }

    public Card placeCard(int index) {
        Card currentCardToPlay = myHand.get(index);
        myHand.remove(index);
        return currentCardToPlay;
    }

    public void pickACard(Deck currentDeck) {
        myHand.add(currentDeck.dealCard());

    }

    @Override
    public String toString() {
        return "You're current hand is " + myHand;
    }
}
