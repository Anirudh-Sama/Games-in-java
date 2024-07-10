
import javax.swing.JFrame;

public class App {
    public static void main(String[] args){
        JFrame obj = new JFrame();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Breakout_Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
