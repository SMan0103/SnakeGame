

import javax.swing.*;

public class drawSnakeClass {

    public static int headX = 50;
    public static int headY = 50;
    public static int speed = 50;

    public drawSnakeClass() {
        drawSnake();
    }

    public void drawSnake() {
        // defining image location
        JLabel snakeHeadUp = new JLabel(new ImageIcon("SnakeGame/Image/snakeHeadUp.png"));
        JLabel snakeBodyLodret = new JLabel(new ImageIcon("SnakeGame/Image/snakeBodyUp.png"));
        JLabel snakeTailDown = new JLabel(new ImageIcon("SnakeGame/Image/snakeTailDown.png"));

        // drawing snake
        snakeHeadUp.setBounds(headX - drawAppleClass.offset, headY, 50, 50);
        Grid.layeredPane.add(snakeHeadUp, JLayeredPane.PALETTE_LAYER);

        snakeBodyLodret.setBounds(50 - drawAppleClass.offset, 100, 50, 50);
        Grid.layeredPane.add(snakeBodyLodret, JLayeredPane.PALETTE_LAYER);

        /*
         * snakeBodyLodret.setBounds(50-drawAppleClass.offset, 150, 50, 50);
         * Grid.layeredPane.add(snakeBodyLodret,JLayeredPane.PALETTE_LAYER);
         * 
         * snakeBodyLodret.setBounds(50-drawAppleClass.offset, 200, 50, 50);
         * Grid.layeredPane.add(snakeBodyLodret,JLayeredPane.PALETTE_LAYER);
         */

        snakeTailDown.setBounds(50 - drawAppleClass.offset, 150, 50, 50);
        Grid.layeredPane.add(snakeTailDown, JLayeredPane.PALETTE_LAYER);

        // adding layers
        Grid.frame.add(Grid.layeredPane);

        // setting visibility true
        Grid.frame.setVisible(true);

    }
}
