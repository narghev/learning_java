import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class GameOfLife extends JFrame {

    private LifePanel ButtonPanel = new LifePanel(5);
    private ControlPanel ControlPanel = new ControlPanel();

    public GameOfLife(){
        super();
        setLayout(new GridLayout());

        add(ButtonPanel);
        add(ControlPanel);

        setSize(800, 300);
        setResizable(true);
        setVisible(true);
    }
}