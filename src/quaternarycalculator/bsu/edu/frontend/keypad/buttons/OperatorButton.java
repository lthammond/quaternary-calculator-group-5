package quaternarycalculator.bsu.edu.frontend.keypad.buttons;

import javax.swing.*;

public class Button extends JButton {
    private String character;
    public Button(String chr) {
        this.character = chr;
    }
    public String getCharacter(){
        return this.character;
    }

}
