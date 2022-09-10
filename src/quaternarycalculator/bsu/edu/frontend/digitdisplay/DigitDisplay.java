package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.backend.Converter;

import javax.lang.model.type.NullType;
import javax.swing.*;

public class DigitDisplay extends JPanel {
    private JLabel displayLabel;
    private JButton toggleBtn;
    public DigitDisplay(){

        this.displayLabel = new JLabel();
        this.toggleBtn = new JButton("Toggle base10");

        this.add(this.displayLabel);
        this.add(this.toggleBtn);
    }

    public void updateLabel(String s){
        String cur = this.displayLabel.getText();
        this.displayLabel.setText(cur+s);
    }

    public void clear(){
        this.displayLabel.setText("");
    }
}
