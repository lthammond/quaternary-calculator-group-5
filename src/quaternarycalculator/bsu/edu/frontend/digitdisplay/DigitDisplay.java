package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.backend.Converter;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitDisplay extends JPanel {
    private JTextField display;


    public DigitDisplay(){
        this.display = new JTextField(9);
        display.setBackground(Color.DARK_GRAY);
        display.setForeground(Color.white);
        display.setFont(new Font("Serif",Font.BOLD,40));
        this.add(this.display);
    }

    public void updateDisplayContent(String s){
        String cur = this.display.getText();
        this.display.setText(cur+s);
    }

    public void clear(){
        this.display.setText("");
    }
}
