package casinogame;
import java.util.Scanner;
import java.util.Scanner;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CasinoGame {

    public static void main(String[] args) throws InterruptedException {
        popUpAgeChecker();
        setUpPlayer();
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to the libary system");
        System.out.println("what would you like to do?");
        System.out.println("1: Play the blackjack game");
        System.out.println("2: Play the slot machine game");
        System.out.println("3: Play the roulette game");

        System.out.println("0-exit");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                runBlackJack();
                break;

            case 2:
                runSlotMachine();
                break;
                
            case 3:
                runRoulette();
                break;
               

            case 0:
                System.out.println("you have chosen to exit");
  
                System.exit(5);
        }
        
        
        
        
        
        
        
        
    }

    private static void popUpAgeChecker() {
        Scanner userInput = new Scanner(System.in);
        final JFrame parent = new JFrame();
        JButton button = new JButton("yes");

        for (int i = 0; i < 1; i++) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "You must be aged 18+ years old to play the casino game, press OK to continue.");
            boolean ok = false;

        }

        System.out.println("Please enter you age to continue as an integer");
        int age = userInput.nextInt();

        if (age == 18 || age > 18) {
            System.out.println("You are old enought to play :-)");
        } else {
            System.out.println("Sorry you are not old enough to play");
            System.exit(1);
        } 
    }  
   
    public static void runBlackJack(){
        blackJackGameRunner blackJackRun = new blackJackGameRunner();
            System.out.println("");
        }
        
    public static void runSlotMachine(){
        System.out.println("");
    }
    
    public static void runRoulette(){
        System.out.println("");
    }
    
    public static void setUpPlayer(){
        System.out.println("");
        Player player = new Player();
    }
    
    
    
    
}
