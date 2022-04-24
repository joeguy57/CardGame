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
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userInput = requestUserInput(input);
        int num_of_players = userInput.get(0);
        int decksNeeded = userInput.get(1);
        int handSize = userInput.get(2);

        // Create the deck
        Deck newDeck = new Deck(decksNeeded);
        newDeck.shuffle();

        // Deal out the player's hands
        ArrayList<Hand> playerHands;
        playerHands = dealHands(num_of_players, newDeck, handSize);
        showPlayersHand(playerHands);

        // Remaining Deck
        System.out.println(newDeck);
    }


    private static ArrayList<Integer> requestUserInput(Scanner input) {
        ArrayList<Integer> userInput = new ArrayList<>();

        System.out.println("This is simple card game where cards will be dealt to players." +
                "\nHow many players are there?");
        userInput.add(input.nextInt());
        System.out.println("How many decks do you require to play a game?");
        userInput.add(input.nextInt());
        System.out.println("What is your hand size ?");
        userInput.add(input.nextInt());

        return userInput;
    }

    private static void showPlayersHand(ArrayList<Hand> playerHands) {
        for (Hand player : playerHands) {
            System.out.print("Player " + (playerHands.indexOf(player) + 1 )+ "'s hand is :\n ");
            System.out.println(player);
        } // for
    }

    private static ArrayList<Hand> dealHands(int playerCount, Deck newDeck, int handSize) {
        ArrayList<Hand> playerHands = new ArrayList<>();
        for (int player = 0; player < playerCount; player++) {
            Hand newHand = new Hand(newDeck, handSize);
            playerHands.add(newHand);
        } // for
        return playerHands;
    }

}
