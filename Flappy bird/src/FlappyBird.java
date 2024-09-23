import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.random;
import javax.swing.*;

public class FlappyBird extends JPanel implements ActionListener, KeyListener{
    int boardwidth = 340;
    int boardheight = 640;

    //Images
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    //Bird
    int birdX = boardwidth/8;
    int birdY = boardheight/2;
    int birdwidth = 34;
    int birdheight = 24;

    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdwidth;
        int height = birdheight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }

    //Game logic
    Bird bird;
    int velocityY = -0;
    int gravity = 1;

    Timer gameloop;

    public FlappyBird() {
        setPreferredSize(new Dimension(boardwidth, boardheight));
        // setBackground(Color.blue); 
        setFocusable(true);
        addKeyListener(this);

        //load images
        backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();   
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();

        //bird
        bird  = new Bird(birdImg);

        //game timer
        gameloop = new Timer(1000/60, this);  //1000/60 = 16.6
        gameloop.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        System.out.println("draw");
        //background
        g.drawImage(backgroundImg, 0, 0, boardwidth, boardheight, null);

        //bird 
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
    }

    public void move(){
        //bird
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            velocityY = -9;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
