import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifeButton extends JButton {
    public LifeButton(){
        super();
        setBackground(Color.BLACK);
        setOpaque(true);
        setBorderPainted(false);
    }

    public boolean isAlive(){
        return (getBackground() == Color.black);
    }

    public void setAlive(boolean alive){
        setBackground(alive ? Color.black : Color.white);
    }
}