//importing packages
import java.util.ArrayList;
import java.util.*;

public class Deck{
    
    Scanner sc=new Scanner(System.in);
    
//ArrayList to store all the cards 
    ArrayList<Card> card=new ArrayList<Card>();
    
    String[] suit={"Club","Diamond","Heart","Spade"};
    
    String[] value={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
//Adding all the cards to create a deck of 52 Cards.
    public void createDeck(){
        //2 for loops : For every suit--every value added
        for(int i=0;i<suit.length;i++){
            for(int j=0;j<value.length;j++){
                this.card.add(new Card(suit[i],value[j]));
            }
        }
    }
    
//Printing the deck
    public void printDeck(){
        //for loop to printing every card from the arraylist
         for (int i=0;i<card.size();i++){
          System.out.println(card.get(i));
         }
    }
    
//Printing a random card
    public void printCard(){
        Collections.shuffle(card);//Shuffles the deck
        //Random function used to print a random card out of the deck of 52 cards.
        Random random = new Random();
        System.out.println(card.get(random.nextInt(52)));
    }
    
//Asking user for 2 Cards and comparing their numeric value(rank)
   public void compareCard(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a card(value suit)");
    String value = sc.next();
    String suit = sc.next();
    Card card1 = new Card(suit,value);

    System.out.print("Enter another card (value suit): ");
    value = sc.next();
    suit = sc.next();
    Card card2 = new Card(suit,value);

    //Checking the numeric value of the cards
    if (card1.sameValue(card2)) {
        System.out.println("Cards have the same rank: ");
        System.out.println(card1);
        System.out.println(card2);
    } else {
        System.out.println("Cards do not have the same rank.");
    }
}

//Deal 5 random cards from the deck
    public void dealCard(){
        Collections.shuffle(card);//Shuffles the deck
        Random random = new Random();
        //Printing 5 random cards.
        for (int i = 0; i < 5; i++) {
            System.out.println(card.get(random.nextInt(52)));
        }
    }
    
//Finding a card in the deck  
   public void findCard(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a card(value suit)");
    String value = sc.next();
    String suit = sc.next();
    Card card3 = new Card(suit,value);
    int flag=0;
    //For loop to loop through the deck and check if a card is present in the deck.
       for (Card c : card) {
            if (c.getSuit().equals(suit) && c.getValue().equals(value)) {
                flag=1;
                System.out.println("Card found!");
            }
        }
        if(flag==0){
            System.out.println("Card not found!");
        }
    }
    
//Displaying cards belonging to the same suit as the card entered.
    public void sameCard(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a card(value suit)");
    String value = sc.next();
    String suit = sc.next();
    Card card4 = new Card(suit,value);
    //looping through the deck to display cards of similar suit. 
          for (Card c : card) {
            if (c.sameSuit(card4)) {
              System.out.println(c);
            }
        }    
}

//Shuffling the Deck  
    public void shuffleDeck(){
        Collections.shuffle(this.card);
    }
}