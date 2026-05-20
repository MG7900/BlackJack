import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.util.Scanner;

public class BasicGameApp implements MouseListener {
    final int WIDTH = 1000;
    final int HEIGHT = 700;

    //Declare the variables needed for the graphics
    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;

    public Rectangle startHitbox;

    public BufferStrategy bufferStrategy;

    public Card[] deck;
    public Player player1;
    public Dealer dealer1;
    public boolean start_game;

    public static void main(String[] args) {
        BasicGameApp A = new BasicGameApp();
    }


    public BasicGameApp() {
        start_game = false;
        setUpGraphics();
        render();

        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];
        int cardIndex = 0;
        dealer1 = new Dealer();
        player1 = new Player();

        for (int b = 0; b < 4; b++) {
            for (int c = 0; c < 13; c++) {
                deck[cardIndex] = new Card(c, (int) (Math.random() * 10), b);
                cardIndex++;
            }
        }

        shuffle();
        //printDeck();
        //give the player cards
        hand();
    }

    public void hand() {
        player1.hand[0] = deck[0];
        player1.hand[1] = deck[1];
        //todo hw: give the dealer 2 cards
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name");
        String aName = s.nextLine();
        System.out.println(aName);
        player1.name = aName;
        player1.calculateTotal();
        player1.printInfo();

        dealer1.hand[0] = deck[2];
        dealer1.hand[1] = deck[3];
        dealer1.calculateTotal();
        dealer1.printInfo();
        if (dealer1.isBust) {
            //game over
            System.out.println(player1.name + " Wins!");
        } else if (player1.isBust) {
            System.out.println("Dealer Wins!");
        }
    }

    public void Hit() {

    }

    public void printDeck() {
        for (int c = 0; c < deck.length; c++) {
            deck[c].printInfo();
        }
    }

    public void shuffle() {
        for (int d = 0; d < deck.length; d++) {
            int randy = (int) (Math.random() * 52);
            Card helper = deck[randy];
            deck[randy] = deck[d];
            deck[d] = helper;
        }
    }


    //change the UI accordingly
    private void setUpGraphics() {
        frame = new JFrame("Application Template");   //Create the program window or frame.  Names it.

        panel = (JPanel) frame.getContentPane();  //sets up a JPanel which is what goes in the frame
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));  //sizes the JPanel
        panel.setLayout(null);   //set the layout

        // creates a canvas which is a blank rectangular area of the screen onto which the application can draw
        // and trap input events (Mouse and Keyboard events)
        canvas = new Canvas();

        canvas.addMouseListener(this);
        //todo: why does the above have to be there?

        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);

        panel.add(canvas);  // adds the canvas to the panel.

        // frame operations
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes the frame close and exit nicely
        frame.pack();  //adjusts the frame and its contents so the sizes are at their default or larger
        frame.setResizable(false);   //makes it so the frame cannot be resized
        frame.setVisible(true);      //IMPORTANT!!!  if the frame is not set to visible it will not appear on the screen!

        // sets up things so the screen displays images nicely.
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        System.out.println("DONE graphic setup");

    }


    //paints things on the screen using bufferStrategy
    private void render() {
        //todo: add keylistener and mouselistener etc✅
        //todo: correct the rendering of the kunais
        //todo: render the heart and lives system

        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);

        //todo: make a better start button
        if (!start_game) {
            g.setColor(Color.blue);
            g.fillRect(400, 400, 200, 50);
        }
        g.dispose();
        bufferStrategy.show();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        boolean mouseheld = true;
        System.out.println(e.getPoint());
        Rectangle mouseHitbox = new Rectangle(e.getX(), e.getY(), 1, 1);
        if (startHitbox.intersects(mouseHitbox)) {
            System.out.println("Game starts!");
            start_game = true;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}