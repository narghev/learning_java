import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {

    public JButton[] controls = new JButton[3];

    public ControlPanel(){
        super();

        controls[0] = new JButton("Reset");
        controls[1] = new JButton("Random");
        controls[2] = new JButton("Step");

        for (JButton button : controls)
            add(button);
    }
}