package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.backend.Converter;

import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitDisplay extends JPanel {
    private JLabel displayLabel;

    public DigitDisplay(){

        this.displayLabel = new JLabel();
        this.add(this.displayLabel);

    }

    public void updateLabel(String s){
        String cur = this.displayLabel.getText();
        this.displayLabel.setText(cur+s);
    }

    public void clear(){
        this.displayLabel.setText("");
    }
}
