import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.lang.Math;

public class GameOfLife extends JFrame implements ActionListener {

    private LifePanel ButtonPanel = new LifePanel(5);
    private ControlPanel ControlPanel = new ControlPanel();

    public GameOfLife(){
        super();
        setLayout(new GridLayout());

        for (JButton controlButton : ControlPanel.controls)
            controlButton.addActionListener(this);

        add(ButtonPanel);
        add(ControlPanel);

        setSize(800, 300);
        setResizable(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JButton clicketButton = (JButton)e.getSource();
        String clickedButtonText = clicketButton.getText();
        
        switch (clickedButtonText){
            case "Reset":
                for (LifeButton[] cellRow : ButtonPanel.cells)
                    for (LifeButton cell : cellRow)
                        cell.setAlive(false);
                break;

            case "Random":
                for (LifeButton[] cellRow : ButtonPanel.cells)
                    for (LifeButton cell : cellRow){
                        double n = Math.random();
                        cell.setAlive(n <= 0.25);
                    }
                break;

            default:
                break;
        }
    }
}