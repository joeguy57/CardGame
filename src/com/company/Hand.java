package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private int size;
    private static ArrayList<Card> myHand;

    /**
     * This constructor is incase handsizes are not fairly distributed
     * @param size and integer
     */
    public Hand(int size) {
        this.size = size;
    }

    public Hand() {
        ArrayList<Card> myHand = new ArrayList<>();
        size = 4;
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

    public static Card placeCard(int index){
        Card currentCardToPlay = myHand.get(index);
        myHand.remove(index);
        return currentCardToPlay;
    }

    public void pickACard(Deck currentDeck){
         myHand.add(currentDeck.dealCard());

    }

    @Override
    public String toString() {
        return "You're current hand is " + myHand;
    }
}
