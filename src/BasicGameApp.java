public class BasicGameApp {
    public Card[] deck;
    public Player player1;
    public Dealer dealer1;
    public boolean game_on;

    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();
    }

    public BasicGameApp(){
        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];

        for(int b = 0; b < deck.length; b++){
            deck[b] = new Card(10, b, "Clubs");
            deck[b].printInfo();
        }
    }

    public void printDeck(){

    }
}
