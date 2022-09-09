package quaternarycalculator.bsu.edu.frontend.digitdisplay;

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


    public void updateFromArray(String[] displayOrder) {
        StringBuilder str = new StringBuilder();
        for(String i : displayOrder){
            if(i != null){
                str.append(i);
                str.append(" ");
            }
        }
        this.displayLabel.setText(str.toString());
    }
}
