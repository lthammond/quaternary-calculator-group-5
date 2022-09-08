package quaternarycalculator.bsu.edu.frontend.keypad.buttons;

import javax.swing.*;

public class OperatorButton extends JButton {
    private String character;
    public OperatorButton(String character) {
        this.character = character;
        this.setText(character);
    }
    public String getSymbol(){
        return this.character;
    }

}
