
package casinogame;

import java.util.*;
public class SlotMachineGame {
    
    public static void main(String args[]){
        
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        int input;
        int julieDollars = 100;
        int islot1, islot2, islot3;
        do{
        System.out.println("slot machine");
        System.out.println(" you have " + julieDollars + " Julie Dollars" );
        System.out.println("press 1 to pull or 2 to quit");
        input = console.nextInt();
        islot1 = rand.nextInt(3)+1;
        islot2 = rand.nextInt(3)+1;
        islot3 = rand.nextInt(3)+1;
        System.out.println(islot1 + " " + islot2 + " "+ islot3);
        
        
        if(islot1 == islot2 && islot1 == islot3){
            System.out.println("congratulations you have just won! you have gained 10 Jullie Dollars");
            julieDollars += 10;
            
            
        }
        
        else if (islot1 == islot2 || islot1 == islot3 || islot2 == islot3){
            System.out.println(" you have won 5 Julie Dollars");
            julieDollars += 5;
        }else{
            System.out.println("you have lost the spin! you have lost 1 Julie Dollar");
            julieDollars -= 1;
            
        }
        }while(input ==1);
        
    }
    
    
    
}
