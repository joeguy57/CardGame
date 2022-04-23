package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is going to help create a basic card game, going off a childhood game of highlow.
 * The basic structure is also going to follow this having to additional classes;
 * - Card
 * - Deck
 */
public class Main { //**

    public static void main(String[] args) {
	// write your code here
        Scanner count = new Scanner(System.in);
        Scanner decks = new Scanner(System.in);
        System.out.println("This is simple card game where cards will be dealt to players.\nHow many players are there?");
        int playerCount = count.nextInt();
        System.out.println("How many decks do you require to play a game?");
        int decksNeeded = decks.nextInt();
        Deck newDeck = new Deck(decksNeeded);
        newDeck.shuffle();
        ArrayList<Hand> playerHands = dealHands(newDeck, playerCount);
        for (Hand player : playerHands){
            System.out.println(player);
        }
        // There rest of the code can be further explained in README
    }

    private static ArrayList<Hand> dealHands(Deck newDeck, int playerCount) {
        ArrayList<Hand> players = new ArrayList<>();
        for (int player = 0; player < playerCount; player++){
            Hand playerHand = new Hand();
            ArrayList<Card> tempHand = new ArrayList<>();
            for (int cards = 0; cards < playerHand.getSize(); cards++){
                tempHand.add(newDeck.dealCard());
            }
            playerHand.setMyHand(tempHand);
            players.add(playerHand);
        }

        return players;
    }
}
