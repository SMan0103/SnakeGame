
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SpeedAFSnakeyboi {

    public static int rotation = 1;
    public static int posx = 0;
    public static int posy = 0;
    // 1 is up, 2 is down, 3 is right, 4 is left

    public static void keyPressed(KeyEvent e) {

        System.out.println("doodoo");

        /*
         * int key = e.getKeyCode();
         * if(ey == KeyEvent.VK_W) {
         * System.out.println("penis");
         * }
         */

        int key = e.getKeyCode();
        if ((key == KeyEvent.VK_W) && (rotation != 2)) {
            rotation = 1;
            System.out.println("penis");
        } else if (key == KeyEvent.VK_A && (rotation != 3)) {
            rotation = 4;
            System.out.println("penis12");
        } else if (key == KeyEvent.VK_S && (rotation != 1)) {
            rotation = 2;
            System.out.println("penis23");
        } else if (key == KeyEvent.VK_D && (rotation != 4)) {
            rotation = 3;
            System.out.println("penis34");
        }
        /*
         * while (rotation == 1) {
         * drawSnakeClass.headY -= drawSnakeClass.headY;
         * }
         * while (rotation == 2) {
         * drawSnakeClass.headY += drawSnakeClass.headY;
         * }
         * while (rotation == 3) {
         * drawSnakeClass.headX += drawSnakeClass.headX;
         * }
         * while (rotation == 4) {
         * drawSnakeClass.headX -= drawSnakeClass.headX;
         * }
         */
    }
}
