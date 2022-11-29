
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App extends KeyAdapter {

    public static boolean running = true;

    public static void main(String[] args) {

        new Grid();
        new drawAppleClass();
        // new drawSnakeClass(1);

        while (running == true) {
            Grid.frame.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    System.out.println("sheesh");

                    int key = e.getKeyCode();

                    if (key == KeyEvent.VK_W) {
                        System.out.println("ad");
                    }
                    // SpeedAFSnakeyboi.keyPressed(e);

                }
            });

        }

    }

    public static class input extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            System.out.println("sheesh");

            int key = e.getKeyCode();

            SpeedAFSnakeyboi.keyPressed(e);

        }
    }
}
