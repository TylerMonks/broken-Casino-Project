package casinogame;

public class Roulettte {

    private int bankRoll;
    private int spinCount;

    public Roulettte(int bankRoll) {
        this.bankRoll = bankRoll;
        this.spinCount = 0;
    }

    public void turn(int bet, String selectedNumber) {
        int betWinnings = bet*36;
int spinNumber = spin();
        if (this.bankRoll >= bet) {
            this.bankRoll -= bet;
            System.out.println(toString());
            if ((spinNumber == Integer.parseInt(selectedNumber)) || (spinNumber == 37 && selectedNumber == "00")) {
                System.out.println("you picked the winning number" + spinNumber + " and win $" + betWinnings + " Julie Dollars");
                this.bankRoll  += betWinnings; 
            } else {
                System.out.println("you did not pick the winning number.");
            }
        } else {
            System.out.println("Sorry, you do not have enough money to make this bet");
        }
        
        System.out.println(toString());
        System.out.println("The winning number is " + spinNumber);
    }

    private int spin() {
        this.spinCount = this.spinCount + 1;
        return (int) Math.floor(Math.random() * 10) % 38;
    }

   
    public String toString() {
        return ("Roulette game:\n" + "Bank Roll = $" + this.bankRoll + "\n" + " Spin count: " + this.spinCount);
    }

    public static void main(String[] args) {
        Roulettte rgl = new Roulettte(10);
        rgl.turn(1, "10");
        rgl.turn(2, "10");

        System.out.println(rgl.spin());
        System.out.println(rgl.toString());

    }

}
