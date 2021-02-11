package casinogame;
import java.util.*;
public class Player {

    public String name;
    private Card[] hand = new Card[10];
    private int numCards;
    public double bettingBalance;

    public Player(String aName, double bettingBalance ) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter your First name");
        this.name = myInput.nextLine();
        System.out.println("Please enter the amount of money you would like to put into your account to bet with, pleae write this as a deciamal e.g. 20.25");
        this.bettingBalance = myInput.nextDouble();
        this.emptyHand();

    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void emptyHand() {
        for (int i = 0; i < 10; i++) {
            this.hand[i] = null;

        }
        this.numCards = 0;

    }

    public boolean addCard(Card aCard) {
        if (this.numCards == 10) {
            System.err.printf(" %s's hand already has 10 cards; " + "cannot add another\n", this.name);
            System.exit(1);
        }
        return (this.getHandSum() <= 21);
    }

    public int getHandSum() {
        int handSum = 0;
        int cardNum;
        int numAces = 0;

        for (int i = 0; i < this.numCards; i++) {
            cardNum = this.hand[i].getMyNumber();
            if (cardNum == 1) {
                numAces++;
                handSum += 11;
            } else if (cardNum > 10) {
                handSum += 10;

            } else {
                handSum += cardNum;
            }

        }
        while (handSum > 21 && numAces > 0) {
            handSum -= 10;
            numAces--;

        }
        return handSum;

    }

    public void printHand(boolean showFirstCard) {

        System.out.printf("%s's  cards:\n", this.name);
        for (int i = 0; i < this.numCards; i++) {
            if (i == 0 && !showFirstCard) {
                System.out.println("  [hidden]");

            } else {
                System.out.printf("  %s\n", this.hand[i].toString());
            }

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBettingBalance() {
        return bettingBalance;
    }

    public void setBettingBalance(double bettingBalance) {
        this.bettingBalance = bettingBalance;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
