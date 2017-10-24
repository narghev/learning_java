import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TempConverter extends JFrame implements ActionListener {

    private JLabel promptLabel = new JLabel("Enter C:");
    private JLabel showLabel = new JLabel("Get F:");
    private JTextField cField = new JTextField(5);
    private JTextField fField = new JTextField(5);
    private JButton convertButton = new JButton("Convert");

    public TempConverter(){

        super("Temperature Converter");

        fField.setEditable(false);
        convertButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(promptLabel);
        add(cField);
        add(showLabel);
        add(fField);
        add(convertButton);

        setSize(400, 70);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent click){
        double c = Double.parseDouble(cField.getText());
        double f = 9 * c / 5 + 32;
        fField.setText(""+f);
    }

    public static void main(String[] args){
        TempConverter app = new TempConverter();
    }
}