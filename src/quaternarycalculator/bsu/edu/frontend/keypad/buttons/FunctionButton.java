package quaternarycalculator.bsu.edu.frontend.keypad.buttons;

import javax.swing.*;

abstract class FunctionButton extends JButton {
    private String character;

    public FunctionButton (String chr){
        this.character = chr;
    }
}
