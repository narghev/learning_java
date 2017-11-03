import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class ControlPanel extends JPanel {

    public JButton[] controls = new JButton[3];

    public ControlPanel(){
        super();

        controls[0] = new JButton("Reset");
        controls[1] = new JButton("Random");
        controls[2] = new JButton("Select");

        for (JButton button : controls)
            add(button);
    }
}