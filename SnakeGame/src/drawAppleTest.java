import javax.swing.*;

public class drawAppleTest {

    public drawAppleTest(JFrame frame) {
        drawApple(frame);
    }

    public void drawApple(JFrame frame) {
        JLabel apple = new JLabel(
                new ImageIcon("SnakeGame/Image/appleSprite.png"));

        JLayeredPane layeredPanel = new JLayeredPane();
        layeredPanel.add(apple, JLayeredPane.PALETTE_LAYER); // palette_layer is layer 2

        frame.add(layeredPanel);

        apple.setBounds(50, 50, 100, 100);
        frame.add(apple);
        frame.setVisible(true);
    }
}