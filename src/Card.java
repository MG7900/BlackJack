public class Card {
    public Card[] cards;
    public int value;
    public String name;
    public String suit;

    //todo: make a constructor that takes in three parameters and
    public Card(int pvalues, int pname, String psuit){
        value = pvalues;
        if(pname == 0 || pname == 1 || pname == 2 || pname == 3) {
            name = "Ace";
            value = 1;
        } else if(pname == 4 || pname == 5 || pname == 6 || pname == 7){
            name = "Two";
            value = 2;
        } else if(pname == 8 || pname == 9 || pname == 10 || pname == 11){
            name = "Three";
            value = 3;
        } else if(pname == 12 || pname == 13 || pname == 14 || pname == 15){
            name = "Four";
            value = 4;
        } else if(pname == 16 || pname == 17 || pname == 18 || pname == 19){
            name = "Five";
            value = 5;
        } else if(pname == 20 || pname == 21 || pname == 22 || pname == 23){
            name = "Six";
            value = 6;
        } else if(pname == 24 || pname == 25 || pname == 26 || pname == 27){
            name = "Seven";
            value = 7;
        } else if(pname == 28 || pname == 29 || pname == 30 || pname == 31){
            name = "Eight";
            value = 8;
        } else if(pname == 32 || pname == 33 || pname == 34 || pname == 35){
            name = "Nine";
            value = 9;
        } else if(pname == 36 || pname == 37 || pname == 38 || pname == 39){
            name = "King";
            value = 10;
        } else if(pname == 40 || pname == 41 || pname == 42 || pname == 43){
            name = "Jack";
            value = 10;
        } else if(pname == 44 || pname == 45 || pname == 46 || pname == 47){
            name = "Queen";
            value = 10;
        } else if(pname == 48 || pname == 49 || pname == 50 || pname == 51){
            name = "Two";
            value = 10;
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
