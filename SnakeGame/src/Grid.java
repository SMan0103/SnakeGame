import javax.swing.*;
import java.awt.*;

//vores bane
public class Grid extends JPanel {

    // variables for layout
    // originX og originY, defines how long we start from the screen until the box
    static int originX = 0;
    static int originY = 0;
    // size of boxes
    static int cellSide = 50;
    // rows and columns
    static int columns = 16;
    static int rows = 16;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // draws the vertical lines
        for (int i = 0; i < rows + 1; i++) {
            g.drawLine(originX, originY + i * cellSide, originX + columns * cellSide, originY + i * cellSide);
        }

        // draws the horizontal lines
        for (int i = 0; i < columns + 1; i++) {
            g.drawLine(originX + i * cellSide, originY, originX + i * cellSide, originY + rows * cellSide);
        }

    }

}
