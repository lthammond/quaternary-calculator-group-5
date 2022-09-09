package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import javax.swing.*;

public class DigitDisplay extends JPanel {
    private JLabel displayLabel;
    private JButton toggleBtn;
    private String num1;
    private String num2;
    private String operator;

    public DigitDisplay(){
        this.displayLabel = new JLabel();
        this.toggleBtn = new JButton("Toggle base10");

        this.add(this.displayLabel);
        this.add(this.toggleBtn);
    }


    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }



}
