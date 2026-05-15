import java.util.Scanner;

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
        int cardIndex = 0;
        dealer1 = new Dealer();
        player1 = new Player();

        for(int b = 0; b < 4; b++){
            for(int c = 0; c < 13; c++){
                deck[cardIndex] = new Card(c, 10, b);
                cardIndex++;
            }
        }

        shuffle();
        printDeck();
        //give the player cards
        player1.hand[0] = deck[0];
        player1.hand[1] = deck[1];
        //todo hw: give the dealer 2 cards
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name");
        String aName = s.nextLine();
        System.out.println(aName);
        player1.name = aName;
        player1.calculateTotal();
        dealer1.hand[0] = deck[2];
        dealer1.hand[0] = deck[3];
    }

    public void printDeck(){
        for(int c = 0; c < deck.length; c++){
            deck[c].printInfo();
        }
    }

    public void shuffle(){
        for(int d = 0; d < deck.length; d++){
            int randy = (int)(Math.random()*52);
            Card helper = deck[randy];
            deck[randy] = deck[d];
            deck[d] = helper;
        }
    }

}
