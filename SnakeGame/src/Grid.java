
import javax.swing.*;

public class Grid {

    public static JFrame frame;
    public static JLayeredPane layeredPane;

    public Grid() {
        drawGrid();
    }

    public static void drawGrid() {
        // variables needed in defining frames
        int widthFrame = 800;
        int heightFrame = 835;

        // define a frame
        frame = new JFrame();

        // size of frame
        frame.setSize(widthFrame, heightFrame);

        // set location of where window will spawn
        frame.setLocation(400, 0);

        // defining the picture location
        JLabel background = new JLabel(new ImageIcon("SnakeGame/Image/gridImage.png"));
        // defining where the picture starts and its width and height
        background.setBounds(-8, -16, widthFrame, heightFrame);

        // adding layers, and defining them
        layeredPane = new JLayeredPane();
        layeredPane.add(background, JLayeredPane.DEFAULT_LAYER); // layer 0
        frame.add(layeredPane);

        // making closing the window possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initializing the window
        frame.setVisible(true);
        frame.setResizable(false);

        // calling apple drawer

    }
}
