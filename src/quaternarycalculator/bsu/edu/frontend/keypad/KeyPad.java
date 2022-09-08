package quaternarycalculator.bsu.edu.frontend.keypad;

import quaternarycalculator.bsu.edu.frontend.keypad.buttons.OperatorButton;

import javax.swing.*;
import java.util.ArrayList;

public class KeyPad extends JPanel {
    public KeyPad(){
        String[] operators = {"+","-"};
        ArrayList<OperatorButton> operatorButtons = new ArrayList<>();
        for (String i :operators){
            operatorButtons.add(new OperatorButton(i));
        }
        for (OperatorButton b : operatorButtons){
            this.add(b);
        }

    }
}
