import javax.swing.*;

//vores bane
public class Grid extends JFrame {

    public Grid() {
        drawGrid();
    }

    public static void drawGrid() {
        // variables needed in defining frames
        int widthFrame = 816;
        int heightFrame = 837;

        // define a frame
        JFrame frame = new JFrame();

        // size of frame
        frame.setSize(widthFrame, heightFrame);

        // set location of where window will spawn
        frame.setLocation(100, 100);

        frame.setLayout(null);
        // defining the picture location
        JLabel background = new JLabel(
                new ImageIcon("SnakeGame/images/gridImage.png"));

        // using jlayered panel
        JLayeredPane layeredPanel = new JLayeredPane();
        layeredPanel.add(background, JLayeredPane.DEFAULT_LAYER); // default_layer is layer 1

        frame.add(layeredPanel);

        // making closing the window possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initializing the window
        frame.set
        frame.setVisible(true);
        // frame.setResizable(false);

        // new drawAppleTest(frame);
    }
}