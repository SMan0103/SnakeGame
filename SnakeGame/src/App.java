import javax.swing.*;
//import java.awt.*;
//import java.lang.Math.*;

public class App {
    public static void main(String[] args) throws Exception {

        // variables needed in defining frame
        int widthFrame = 801;
        int heightFrame = 828;

        // define a frame
        JFrame frame = new JFrame();
        // JPanel panel = new JPanel();
        // JLabel label = new JLabel("du sejler mere end joe");

        // size of frame
        frame.setSize(widthFrame, heightFrame);

        // set location of where window will spawn
        frame.setLocation(100, 100);

        // bla bla
        Grid Gpanel = new Grid();
        frame.add(Gpanel);

        // making closing the window possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initializing the window
        frame.setVisible(true);

    }
}
