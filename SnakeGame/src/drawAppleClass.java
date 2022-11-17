import java.awt.*;
import java.awt.image.ImageObserver;
import javax.swing.*;

public class drawAppleClass extends JLabel {
    public Image apple;

    public int madX;
    public int madY;

    int[] posXArr = new int[256];
    int[] posYArr = new int[256];

    public drawAppleClass() {
        definePositionalArrays(posXArr, posYArr);
        nytMad(posXArr, posYArr, getGraphics());
        drawApple(madX, madY, getGraphics());
    }

    public void drawApple(int madX, int madY, Graphics g) {
        ImageIcon iia = new ImageIcon("SnakeGame/images/appleSprite.png");
        apple = iia.getImage();

        g.drawImage(apple, madX, madY, (ImageObserver) this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        nytMad(posXArr, posYArr, getGraphics());
        System.out.println("goddag");
        drawApple(madX, madY, getGraphics());

    }

    public void nytMad(int[] posXArr, int[] posYArr, Graphics g) {

        int r_x = (int) (Math.random() * (255 - 0 + 1) + 0);
        int r_y = (int) (Math.random() * (255 - 0 + 1) + 0);

        int madX = posXArr[r_x];
        int madY = posYArr[r_y];

        drawApple(madX, madY, g);

    }

    public static void definePositionalArrays(int[] posXArr, int[] posYArr) {
        int æ = 0;

        for (int å = 0; å < posXArr.length; å++) {

            if (æ == 16) {
                æ = 0;
                posXArr[å] = æ * 50;
                æ++;
            } else {
                posXArr[å] = æ * 50;
                æ++;
            }

        }
        for (int å = 0; å < posYArr.length; å++) {

            if (æ == 16) {
                æ = 0;
                posYArr[å] = æ * 50;
                æ++;
            } else {
                posYArr[å] = æ * 50;
                æ++;
            }
        }

    }
}
