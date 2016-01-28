package p1;

/*
 * Project that simulates a game of bridge by shuffling a deck of cards, dealing them out, and displaying hands.
 * CSC 164
 * Mike Fiehl
 * 26, Jan 2016
 * Version 2.0
 */

import java.util.Random;

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

        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }// end for

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

        // Split the deck array into 4 different arrays which simulates each player being dealt 13 cards

        // Deal and show North's hand
        System.arraycopy(deck, 0, north, 0, 13);
        System.out.printf("\n--------------------\nNorth's Hand:\n\n");
        for (int i = 0; i < north.length; i++)
        {
            String suit = suits[north[i] / 13];
            String rank = ranks[north[i] % 13];
            System.out.println(rank + " of " + suit);
        }// end for

        // Deal and show East's hand
        System.arraycopy(deck, 13, east, 0, 13);
        System.out.printf("\n--------------------\nEast's Hand:\n\n");
        for (int i = 0; i < east.length; i++)
        {
            String suit = suits[east[i] / 13];
            String rank = ranks[east[i] % 13];
            System.out.println(rank + " of " + suit);
        }// end for

        // Deal and show South's hand
        System.arraycopy(deck, 26, south, 0, 13);
        System.out.printf("\n--------------------\nSouth's Hand:\n\n");
        for (int i = 0; i < south.length; i++)
        {
            String suit = suits[south[i] / 13];
            String rank = ranks[south[i] % 13];
            System.out.println(rank + " of " + suit);
        } // end for

        // Deal and show West's hand
        System.arraycopy(deck, 39, west, 0, 13);
        System.out.printf("\n--------------------\nWest's Hand:\n\n");
        for (int i = 0; i < west.length; i++)
        {
            String suit = suits[west[i] / 13];
            String rank = ranks[west[i] % 13];
            System.out.println(rank + " of " + suit);
        }// end for
    }
}

