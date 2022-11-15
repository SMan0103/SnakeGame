import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import java.lang.Math.*;

public class App {

    private Image apple;

    public static void main(String[] args) throws Exception {

        int[] posXArr = new int[256];
        int[] posYArr = new int[256];

        definePositionalArrays(posXArr, posYArr);

        // variables needed in defining frames
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

        // draw(g, int x, int y);

        // frame.add(callSquare);

        nytMad(posXArr, posYArr);
        // making closing the window possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initializing the window
        frame.setVisible(true);
        apple();

    }

    public void apple() {
        loadImages();
    }

    public static void drawSquare(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.drawRect(x, y, 50, 50);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
    }

    public static void nytMad(int[] posXArr, int[] posYArr) {

        int r_x = (int) (Math.random() * (posXArr.length - 0 + 1) + 0);
        int r_y = (int) (Math.random() * (posYArr.length - 0 + 1) + 1);

        int madX = posXArr[r_x];
        int madY = posYArr[r_y];

        // drawMad(madX, madY);

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

    public abstract void loadImages() {
        ImageIcon iih = new ImageIcon(
                "/Users/emilpedersen/Documents/GitHub/SnakeGame/SnakeGame/src/Apple snakegame.png");
        apple = iih.getImage();
    }
}
