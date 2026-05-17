public class Dealer {
    public boolean isOver16;
    public int card_total;
    public Card[] hand;
    public boolean isBust;

    public Dealer(){
        isBust = false;
        card_total = 0;
        hand = new Card[2];
        isOver16 = false;
    }

    public void printInfo(){
        System.out.println("dealer1.isOver16: " + isOver16);
        System.out.println("dealer1.Card total: " + card_total);
        System.out.println("dealer1.isBust: " + isBust);
        for(int a = 0; a < hand.length; a++){
            hand[a].printInfo();
        }
    }

    public void calculateTotal(){
        int addedValue = 0;
        for(int d = 0; d < hand.length; d++){
            addedValue  = addedValue + hand[d].value;
        }
        card_total = addedValue;
    }
}
