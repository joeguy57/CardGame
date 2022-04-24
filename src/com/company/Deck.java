package com.company;

import java.util.*;

public class Deck {
    private final ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck(int decksNeeded) {
        List<String> validSuit = Card.getValidSuit();
        List<String> validNames = getValidNames();

        this.deck = new ArrayList<>();
        for (int deckNo = 0; deckNo < decksNeeded; deckNo++) {
            for (String suit : validSuit) {
                for (String name : validNames) {
                    this.deck.add(new Card(name, suit));
                }
            }
        }
    }

    private static List<String> getValidNames() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        Card currentTop = deck.get(0);
        deck.remove(0);
        return currentTop;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
