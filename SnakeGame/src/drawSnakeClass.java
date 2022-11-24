
import javax.swing.*;

public class drawSnakeClass {

    public static int headX = 50;
    public static int headY = 50;
    public static int speed = 50;

    public drawSnakeClass(int rotation) {
        drawSnake(rotation);
    }

    public void drawSnake(int rotation) {
        // defining image location
        JLabel snakeHeadUp = new JLabel(new ImageIcon("SnakeGame/Image/snakeHeadUp.png"));
        JLabel snakeHeadDown = new JLabel(new ImageIcon("SnakeGame/Image/snakeHeadDown.png"));
        JLabel snakeHeadRight = new JLabel(new ImageIcon("SnakeGame/Image/snakeHeadRight.png"));
        JLabel snakeHeadLeft = new JLabel(new ImageIcon("SnakeGame/Image/snakeHeadLeft.png"));

        JLabel snakeBodyLodret = new JLabel(new ImageIcon("SnakeGame/Image/snakeBodyUp.png"));
        JLabel snakeBodyVandret = new JLabel(new ImageIcon("#"));

        JLabel snakeTailDown = new JLabel(new ImageIcon("SnakeGame/Image/snakeTailDown.png"));
        JLabel snakeTailUp = new JLabel(new ImageIcon("#"));
        JLabel snakeTailLeft = new JLabel(new ImageIcon("#"));
        JLabel snakeTailRight = new JLabel(new ImageIcon("#"));

        new SpeedAFSnakeyboi();

        if (rotation == 1) { // up
            snakeHeadUp.setBounds(headX - drawAppleClass.offset, headY, 50, 50);
            Grid.layeredPane.add(snakeHeadUp, JLayeredPane.PALETTE_LAYER);
        } else if (rotation == 2) { // down
            snakeHeadDown.setBounds(headX - drawAppleClass.offset, headY, 50, 50);
            Grid.layeredPane.add(snakeHeadUp, JLayeredPane.PALETTE_LAYER);
        } else if (rotation == 3) { // right
            snakeHeadRight.setBounds(headX - drawAppleClass.offset, headY, 50, 50);
            Grid.layeredPane.add(snakeHeadUp, JLayeredPane.PALETTE_LAYER);
        } else if (rotation == 4) { // left
            snakeHeadLeft.setBounds(headX - drawAppleClass.offset, headY, 50, 50);
            Grid.layeredPane.add(snakeHeadUp, JLayeredPane.PALETTE_LAYER);
        }
        // drawing snake
        /*
         * snakeHeadUp.setBounds(headX - drawAppleClass.offset, headY, 50, 50);
         * Grid.layeredPane.add(snakeHeadUp, JLayeredPane.PALETTE_LAYER);
         * 
         * snakeBodyLodret.setBounds(50 - drawAppleClass.offset, 100, 50, 50);
         * Grid.layeredPane.add(snakeBodyLodret, JLayeredPane.PALETTE_LAYER);
         * 
         * snakeTailDown.setBounds(50 - drawAppleClass.offset, 150, 50, 50);
         * Grid.layeredPane.add(snakeTailDown, JLayeredPane.PALETTE_LAYER);
         */

        // adding layers
        Grid.frame.add(Grid.layeredPane);

        // setting visibility true
        Grid.frame.setVisible(true);

    }
}
