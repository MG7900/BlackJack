public class Player {
    public int card_total;
    public Card[] hand;
    public boolean isBust;
    public boolean isHit;
    public String name;

    public Player(){
        name = "James Smurf";
        isHit = false;
        isBust = false;
        card_total = 0;

    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(isBust);
        System.out.println(isHit);
        System.out.println(card_total);
        for(int a = 0; a <= hand.length; a++){
            System.out.println(hand[a]);
        }
    }
}
