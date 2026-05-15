public class Dealer {
    public boolean isOver16;
    public int card_total;
    public Card[] hand;
    public boolean isBust;

    public Dealer(){
        isBust = false;
        card_total = 0;
        isOver16 = false;
    }

    public void printInfo(){
        System.out.println(isOver16);
        System.out.println(card_total);
        System.out.println(isBust);
        for(int a = 0; a <= hand.length; a++){
            System.out.println(hand[a]);
        }
    }
}
