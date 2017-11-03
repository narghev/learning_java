import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class LifePanel extends JPanel {

    public LifeButton[][] cells;

    public LifePanel(int n){
        super();

        setLayout(new FlowLayout());

        cells = new LifeButton[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                cells[i][j] = new LifeButton();
                add(cells[i][j]);
            }
        }
    }
}