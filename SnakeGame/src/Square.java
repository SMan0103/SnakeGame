import javax.swing.*;
import java.awt.*;

public class Square extends JFrame {

    public static void doodoo(Graphics g, int x, int y) {

        g.setColor(Color.RED);
        g.drawRect(x, y, 50, 50);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
    }
}
