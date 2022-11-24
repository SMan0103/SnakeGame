
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {

    public static boolean running = true;

    public static void main(String[] args) {

        new Grid();
        new drawAppleClass();
        new drawSnakeClass(1);
        while (running == true) {

        }

    }


    public class input extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            SpeedAFSnakeyboi.keyPressed(e);
        }
    }
}
