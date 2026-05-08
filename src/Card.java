public class Card {
    public Card[] cards;
    public int value;
    public String name;
    public String suit;

    //todo: make a constructor that takes in three parameters and
    public Card(int pvalues, int pname, String psuit){
        value = pvalues;
        if(pname == 0) {
            name = "Ace";
            value = 11;
        } else if(pname == 1){
            name = "Two";
            value = 2;
        }
        suit = psuit;
    }

    public void printInfo(){
//        System.out.println(values);
//        System.out.println(name);
//        System.out.println(suit);
        System.out.println("The value of " + name + " of " + suit + " is worth " + value + " points.");
    }
}
