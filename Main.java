/**Name:Dhvani Uday Parekh
 Prn:21070126126
 Branch and Batch:AIML-B3
 **/
import java.util.*;
public class Main{
private static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
      //creating object of Deck class
        Deck d=new Deck();
        int p1=1;//variable to help with do while loop
        
        //Menu driven code to ask user for their choice and call respective methods.
        do{
        System.out.println("Select choice:");
        System.out.println("1. Create Deck:");
        System.out.println("2. Print Deck:");
        System.out.println("3. Print Card:");
        System.out.println("4. Cards from the same suit:");
        System.out.println("5. Compare cards:");
        System.out.println("6. Find a card:");
        System.out.println("7. Deal Cards:");
        System.out.println("8. Shuffle Deck:");
 
        int ch=sc.nextInt();//to store choice of user
        
        switch(ch){
            case 1:
                d.createDeck();
                System.out.println("Deck created");
                break;
            case 2:
                d.printDeck();
                break;
            case 3:
                d.printCard();
                break;
            case 4:
                d.sameCard();
                break;
            case 5:
                d.compareCard();
                break;
            case 6:
                d.findCard();
                break;
            case 7:
                d.dealCard();
                break;
            case 8:
                d.shuffleDeck();
                System.out.println("Deck Shuffled");
                break;
            default:
                    System.out.println("\nInvalid choice, try again.");
                    break;
            }
            System.out.println("Enter 1 to continue");
            p1=sc.nextInt();
        }while(p1==1);
    }
}