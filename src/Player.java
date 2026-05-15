public class Player {
    public int card_total;
    public Card[] hand;
    public boolean isBust;
    public boolean isHit;
    public String name;

    public Player(){
        name = "James Smurf";
        isHit = false;
        hand = new Card[2];
        isBust = false;
        card_total = 0;

    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("isBust: " + isBust);
        System.out.println("isHit: " + isHit);
        System.out.println("Card total: " + card_total);
        for(int a = 0; a <= hand.length; a++){
            hand[a].printInfo();
        }
    }
    //todo: make a method called calculuateTotal
    public void calculateTotal(){
        int addedValue = 0;
        for(int d = 0; d < hand.length; d++){
            addedValue  = addedValue + hand[d].value;
        }
        card_total = addedValue;
    }
}
