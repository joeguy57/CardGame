package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * This class will build an individual card in order to store it within a deck
 */
public class Card {
    private String name, suit;
    private static List<String> validSuit = Arrays.asList("hearts", "spades", "diamonds", "clubs");

    public Card(String name, String suit) {
        this.name = name;
        if (validSuit.contains(suit)){
            this.suit = suit;
        }//if
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public static List<String> getValidSuit() {
        return validSuit;
    }


    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
