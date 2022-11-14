import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import java.lang.Math.*;

public class App {

    public static void main(String[] args) throws Exception {

        definePositionalArrays();

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

        // mad();
        // making closing the window possible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // initializing the window
        frame.setVisible(true);

    }

    public static void drawSquare(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.drawRect(x, y, 50, 50);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
    }

    public static void nytmad() {
        int xi, yi, x = 10, y = x, w = 30, h = w, offset = 2;
        int grid = 13, many = grid * grid;

        color col1 = (Color.RED);
        color col2 = (Color.blue);
        boolean switchcol = true;
        PImage myPicture;

        boolean[] apple = new boolean[];
        BufferedImage myPicture = ImageIO.read(new File("Apple snakegame.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        add(picLabel);
        apple[(int) Random(many)] = true;
    }

    public static void definePositionalArrays() {
        int æ = 0;
        int[] posXArr = new int[256];
        int[] posYArr = new int[256];
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
