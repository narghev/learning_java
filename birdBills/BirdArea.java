import javax.swing.JTextArea;
import java.awt.Color;

public class BirdArea extends JTextArea implements Runnable {
    private BirthThread bird;
    private Thread birdThread;
    private Thread textAreaThread;
    public int speed = 1000;

    public BirdArea(char bill0, char bill1, boolean isRight){
        super(1,1);

        bird = new BirthThread(bill0, bill1, isRight);

        birdThread = new Thread(bird);
        textAreaThread = new Thread(this);

        setBackground(Color.BLACK);
        setForeground(Color.YELLOW);

        setColumns(5); 
    }

    public void start(){
        birdThread = new Thread(bird);
        textAreaThread = new Thread(this);
        
        birdThread.start();
        textAreaThread.start();
    }

    public void stop(){
        birdThread.stop();
        textAreaThread.stop();
    }

    public void slow_down(){
        bird.speed *= 2;
    }

    public void speed_up(){
        if (bird.speed >= 100)
            bird.speed /= 2;
    }

    public void run(){
        while (true){
            setText(bird.toString()); 
        }
    }
}