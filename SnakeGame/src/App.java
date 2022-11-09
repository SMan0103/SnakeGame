import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        // variables needed in defining frame
        int widthFrame = 400;
        int heightFrame = 400;

        // define a frame
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("du sejler mere end joe");

        // size of frame
        frame.setSize(400,400);

        // set location of where window will spawn
        frame.setLocation(100, 100);

        // bla bla
        panel.add(label);
        frame.add(panel);

        // making closing the window possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initializing the window
        frame.setVisible(true);
    }
    
}
