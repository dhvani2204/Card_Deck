public class Card
{
   //Declaring suit and rank variables
    private String suit;
    private String value;
  
    //Constructor to declare and initialise suit and value
    public Card(String suit,String value){
        this.suit=suit;
        this.value=value;
    }
    //to get the suit
    public String getSuit(){
        return suit;
    }
    //to set the suit
    public void setSuit(String suit){
        this.suit=suit;
    }
    //to get the value 
    public String getValue(){
        return value;
    }
    //to set the value
    public void setValue(String value){
        this.value=value;
    }
    //returning the card
    public String toString(){
        return "\n Card is "+value+" of "+suit;
    }
    //method to check whether two cards have same suit
        public boolean sameSuit(Card card) {
        return this.suit.equals(card.getSuit());
    }
    //method to check whether two cards have same value
    public boolean sameValue(Card card) {
        return this.value.equals(card.getValue());
    }
     }