
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SpeedAFSnakeyboi extends KeyAdapter {

    public boolean up = true;
    public boolean down = false;
    public boolean left = false;
    public boolean right = false;

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        if ((key == KeyEvent.VK_W) && (down = false)) {
            left = false;
            right = false;
            up = true;
        }
        if (key == KeyEvent.VK_A && (right = false)) {
            left = true;
            up = false;
            down = false;
        }
        if (key == KeyEvent.VK_S && (up = false)) {
            left = false;
            right = false;
            down = true;
        }
        if (key == KeyEvent.VK_D && (left = false)) {

            right = false;
            up = false;
            down = true;
        }

        while (up = true) {
            drawSnakeClass.headY = drawSnakeClass.headY - drawSnakeClass.speed;
        }
    }
}
