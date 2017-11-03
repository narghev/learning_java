import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class GameOfLife extends JFrame {

    private LifePanel ButtonPannel = new LifePanel(5);

    public GameOfLife(){
        super();

        add(ButtonPannel);

        setSize(800, 800);
        setResizable(true);
        setVisible(true);
    }
}