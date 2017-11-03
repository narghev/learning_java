import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifeButton extends JButton implements ActionListener {
    public LifeButton(){
        super();
        setBackground(Color.BLACK);
        setOpaque(true);
        setBorderPainted(false);
        addActionListener(this);
    }

    public boolean isAlive(){
        return (getBackground() == Color.black);
    }

    public void setAlive(boolean alive){
        setBackground(alive ? Color.black : Color.white);
    }

    public void actionPerformed(ActionEvent e){
        setAlive(!isAlive());
    }
}