package EventListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public public class TimerTest {
    public static void main(String[] args) {
        
    Countdown listener = new Countdown();
    final int DELAY = 1000; // milliseconds between timer ticks
    Timer t = new Timer(DELAY, listener);
    t.start();
    JOptionPane.showMessageDialog(null, "Quit?");
    System.exit(0);
    }
} 
