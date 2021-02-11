package casinogame;

import java.util.Scanner;

public class blackJackGameRunner {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Deck theDeck = new Deck(1, true);
        Player me = new Player("Tyler");
        Player dealer = new Player("cardDealer");

        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());
        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());

        System.out.println("Cards are dealt\n");
        me.printHand(true);
        dealer.printHand(false);
        System.out.println("\n");

        boolean meDone = false;
        boolean dealerDone = false;
        String ans;

        while (!meDone || !dealerDone) {
            if (!meDone) {
                System.out.println("Hit or Stay? (Enter H or S): ");
                ans = userInput.next();
                System.out.println();

                if (ans.compareToIgnoreCase("H") == 0) {

                    meDone = !me.addCard(theDeck.dealNextCard());
                    me.printHand(true);

                } else {
                    meDone = true;
                }

            }

            if (!dealerDone) {
                if (dealer.getHandSum() < 17) {
                    System.out.println(" The dealer hits\n");
                    dealerDone = !dealer.addCard(theDeck.dealNextCard());
                    dealer.printHand(false);
                } else {
                    System.out.println("The dealer stays\n");
                    dealerDone = true;

                }
            }

            System.out.println();

        }

        userInput.close();
        me.printHand(true);
        dealer.printHand(true);
        int mySum = me.getHandSum();
        int dealerSum = dealer.getHandSum();

        if (mySum > dealerSum && mySum <= 21 || dealerSum > 21) {
            System.out.println(" you Win!");

        } else {
            System.out.println("dealer wins! ");

        }

    }
}
