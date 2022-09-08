package quaternarycalculator.bsu.edu.frontend.keypad.buttons;

import javax.swing.*;

public class OperatorButton extends JButton {
    private String character;
    public OperatorButton(String chr) {
        this.character = chr;
    }
    public String getCharacter(){
        return this.character;
    }

}
