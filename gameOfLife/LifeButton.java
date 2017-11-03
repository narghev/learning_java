import javax.swing.JButton;

import java.awt.Color;

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