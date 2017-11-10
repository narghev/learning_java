import javax.swing.JTextArea;

public class BirdArea extends JTextArea implements Runnable {
    private BirthThread bird;
    private Thread birdThread;
    private Thread textAreaThread;
    private int speed = 1000;

    public BirdArea(char bill0, char bill1, boolean isRight){
        super(1,1);

        bird = new BirthThread(bill0, bill1, isRight);

        birdThread = new Thread(bird);
        textAreaThread = new Thread(this);

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

    public void run(){
        while (true){
            setText(bird.toString());

            try {
                Thread.sleep(speed);
            } catch(InterruptedException ex) {}   
        }
    }
}