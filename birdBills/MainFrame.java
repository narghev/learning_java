import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.GridLayout;

public class MainFrame extends JFrame implements ActionListener {
    private BirdArea smile = new BirdArea('r', 'E', true);
    private BirdArea sing = new BirdArea('4', 'j', false);
    private JButton start = new JButton("Start");
    private JButton slow = new JButton("Slow Down");
    private JButton speed = new JButton("Speed Up");
    private JButton stop = new JButton("Stop");

    public MainFrame(){
        super();

        setLayout(new GridLayout());

        start.addActionListener(this);
        slow.addActionListener(this);
        speed.addActionListener(this);
        stop.addActionListener(this);

        stop.setEnabled(false);
        start.setEnabled(true);

        add(smile);
        add(sing);
        add(start);
        add(slow);
        add(speed);
        add(stop);

        setSize(500,70);
        setVisible(true);
    }

    public static void main(String[] args){
        new MainFrame();
    }

    public void actionPerformed(ActionEvent click){
        JButton clickedButton = (JButton)click.getSource();
        String clickedButtonText = clickedButton.getText();

        switch (clickedButtonText){
            case "Start":
                stop.setEnabled(true);
                start.setEnabled(false);

                smile.start();
                sing.start();
            break;
            case "Stop":
                stop.setEnabled(false);
                start.setEnabled(true);

                smile.stop();
                sing.stop();
            break;

            case "Slow Down":
                smile.slow_down();
                sing.slow_down();
            break;

            case "Speed Up":
                smile.speed_up();
                sing.speed_up();
            break;
        }
    }
}