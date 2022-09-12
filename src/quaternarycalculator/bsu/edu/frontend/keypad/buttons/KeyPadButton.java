package quaternarycalculator.bsu.edu.frontend.keypad.buttons;

import javax.swing.*;
import java.awt.*;

public class KeyPadButton extends JButton {
    private String character;
    public KeyPadButton(String character) {
        this.character = character;
        this.setText(character);
    }
    public String getSymbol(){
        return this.character;
    }

}
