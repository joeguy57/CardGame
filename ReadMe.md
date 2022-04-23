# A Simple Game of Cards
## The Deck
The class deck can take as many decks as inputted within main.java.
This allows for the deck to be expanded and for multiple games to be built  of this platform.

## The Card
The class named Card validates that a valid card is being created and this can expand on multiple list to play non traditional card games i.e. UNO but would require more fields.

## The Hand
The class Hand makes sure a player has x number of cards. to ensure that a players is getting the right number of cards. It also places another constructor in case a game is played where not all players get the same number of cards or where the deck is evenly distributed.

## How to create this library
This library is created like any other object within the Java universe. to create a new Deck copy the code below: 
<br><br>
``
Deck newDeck = new Deck(*);
``
<br><br>
Where the * is placed is where you would add the number of decks required. For default use 1 to create one deck. This class will also setup the cards required. Look at main to see how the other classes are used in connection with the deck.