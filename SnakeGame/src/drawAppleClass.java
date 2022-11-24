import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class drawAppleClass {

    public int[] applePos = new int[2];
    // offset for making apple fit in the grid
    public static int offset = 5;
    public boolean appleDrawn = false;

    public drawAppleClass() {
        drawApple();
    }

    public void drawApple() {

        // defining apple file location
        JLabel apple = new JLabel(new ImageIcon("SnakeGame/Image/appleSprite.png"));

        // TODo - make it spawn random
        if (!appleDrawn) {
            applePos[0] = ((int) (Math.random() * (16 - 0 + 1) - 0)) * 50;
            applePos[1] = ((int) (Math.random() * (16 - 0 + 1) - 0)) * 50;

            // defining apple size and location on board
            apple.setBounds(applePos[0] - offset, applePos[1], 50, 50);

            appleDrawn = true;
        }

        // adding layers
        Grid.layeredPane.add(apple, JLayeredPane.PALETTE_LAYER); // layer 1
        Grid.frame.add(Grid.layeredPane);

        // setting visibility true
        Grid.frame.setVisible(true);
    }
}
