package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is going to help create a basic card game, going off a childhood game of
 * highlow.
 * The basic structure is also going to follow this having to additional
 * classes;
 * - Card
 * - Deck
 */
public class Main { // **

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out
                .println("This is simple card game where cards will be dealt to players.\nHow many players are there?");
        int playerCount = input.nextInt();
        System.out.println("How many decks do you require to play a game?");
        int decksNeeded = input.nextInt();
        System.out.println("What is your hand size ?");
        int handsize = input.nextInt();
        Deck newDeck = new Deck(decksNeeded);
        newDeck.shuffle();
        ArrayList<Hand> playerHands = new ArrayList<>();
        for (int player = 0; player < playerCount; player++) {
            Hand newHand = new Hand(newDeck, handsize);
            playerHands.add(newHand);
        } // for
        for (Hand player : playerHands) {
            System.out.println(player);
        } // for
          // There rest of the code can be further explained in README
    }

}
