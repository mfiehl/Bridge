package p1;

/*
 * Project that simulates a game of bridge by shuffling a deck of cards, dealing them out, sorting each hand,
 * and finally displaying each hand.
 * CSC 164
 * Mike Fiehl
 * 2, Feb 2016
 * Version 3.0
 */

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        int[] deck = new int[52];
        int[] north = new int[13];
        int[] east = new int[13];
        int[] south = new int[13];
        int[] west = new int[13];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize deck
        initializeDeck(deck);

        // Shuffle deck
        shuffleDeck(deck);

        // Deal cards to four players
        dealCards(deck, north, east, south, west);

        // Sort each player's hand
        sortCards(north, east, south, west);

        // Show each player's hand
        showHands(suits, ranks, north, east, south, west);
    }// end main(method)

// ------------------------------ Methods ------------------------------

    private static void initializeDeck(int[] deck)
    {
        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }// end for
    }// end initializeDeck method

    private static void shuffleDeck(int[] deck)
    {
        // Shuffle the deck 3 times
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < deck.length; j++)
            {
                // Generate an index randomly
                int index = (int) (Math.random() * deck.length);
                int temp = deck[j];
                deck[j] = deck[index];
                deck[index] = temp;
            }// end for inner
        }// end for outer
    }// end shuffleDeck method

    private static void dealCards(int[] deck, int[] north, int[] east, int[] south, int[] west)
    {
        // Deal North's hand
        System.arraycopy(deck, 0, north, 0, 13);

        // Deal East's hand
        System.arraycopy(deck, 13, east, 0, 13);

        // Deal South's hand
        System.arraycopy(deck, 26, south, 0, 13);

        // Deal West's hand
        System.arraycopy(deck, 39, west, 0, 13);
    }// end dealCards method

    private static void sortCards(int[] north, int[] east, int[] south, int[] west)
    {
        // Sort all player's hands
        Arrays.sort(north);
        Arrays.sort(east);
        Arrays.sort(south);
        Arrays.sort(west);
    }// end sortCards method

    private static void showHands(String[] suits, String[] ranks, int[] north, int[] east, int[] south, int[] west)
    {
        // Show North's hand
        System.out.printf("\n--------------------\nNorth's Hand:\n\n");
        for (int i = 0; i < north.length; i++)
        {
            String suit = suits[north[i] / 13];
            String rank = ranks[north[i] % 13];
            System.out.println(rank + " of " + suit);
        }// end for

        // Show East's hand
        System.out.printf("\n--------------------\nEast's Hand:\n\n");
        for (int i = 0; i < east.length; i++)
        {
            String suit = suits[east[i] / 13];
            String rank = ranks[east[i] % 13];
            System.out.println(rank + " of " + suit);
        }// end for

        // Show South's hand
        System.out.printf("\n--------------------\nSouth's Hand:\n\n");
        for (int i = 0; i < south.length; i++)
        {
            String suit = suits[south[i] / 13];
            String rank = ranks[south[i] % 13];
            System.out.println(rank + " of " + suit);
        } // end for

        // Show West's hand
        System.out.printf("\n--------------------\nWest's Hand:\n\n");
        for (int i = 0; i < west.length; i++)
        {
            String suit = suits[west[i] / 13];
            String rank = ranks[west[i] % 13];
            System.out.println(rank + " of " + suit);
        }// end for
    }// end showHands method
}// end main(class)

