package casinogame;

import java.util.Random;
import java.util.ArrayList;
import java.util.*;

public class Deck {

    private Card[] myCards;
    private int numOfCards;

    public Deck() {
        this(1, false);

    }

    public Deck(int numOfDecks, boolean Shuffle) {
        this.numOfCards = numOfDecks * 52;
        this.myCards = new Card[this.numOfCards];

        int z = 0;
        for (int i = 0; i < numOfDecks; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 1; k <= 13; k++) {
                    this.myCards[z] = new Card(Suit.values()[j], k);
                    z++;

                }
            }
        }

        if (Shuffle) {
            this.Shuffle();
        }

    }

    public void Shuffle() {
        Random randomNumberGenerator = new Random();

        Card temp;
        int m;
        for (int a = 0; a < this.numOfCards; a++) {
            m = randomNumberGenerator.nextInt(this.numOfCards);

            temp = this.myCards[a];
            this.myCards[a] = this.myCards[m];
            this.myCards[m] = temp;

        }
    }

    public Card dealNextCard() {
        Card top = this.myCards[0];

        for (int c = 1; c < this.numOfCards; c++) {
            this.myCards[c - 1] = this.myCards[c];

        }
        this.myCards[this.numOfCards - 1] = null;
        this.numOfCards--;

        return top;

    }

    public void printDeck(int numToPrint) {
        for (int c = 0; c < numToPrint; c++) {
            System.out.printf("% 3d/%d %s\n", c + 1, this.numOfCards, this.myCards[c].toString());

        }
        System.out.printf("\t\t[%d other]\n", this.numOfCards - numToPrint);

    }

}
