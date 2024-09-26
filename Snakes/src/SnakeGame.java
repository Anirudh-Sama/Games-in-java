import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class SnakeGame extends JPanel{
    int boardWidth;
    int boardHeight;

    SnakeGame(int boardWidth, int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
    }
}
