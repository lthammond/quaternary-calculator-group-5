package quaternarycalculator.bsu.edu.frontend.keypad;

import quaternarycalculator.bsu.edu.frontend.keypad.buttons.KeyPadButton;

import javax.swing.*;
import java.util.ArrayList;

public class KeyPad extends JPanel {
    private ArrayList<KeyPadButton> operatorButtons;
    private ArrayList<KeyPadButton> numberButtons;
    public ArrayList<KeyPadButton> getOperatorButtons() {
        return operatorButtons;
    }
    public ArrayList<KeyPadButton> getNumberButtons() {
        return numberButtons;
    }

    public KeyPad() {
        String[] numbers = {"0", "1", "2", "3"};
        this.numberButtons = new ArrayList<>();
        for (String i : numbers) {
            this.numberButtons.add(new KeyPadButton(i));
        }
        for (KeyPadButton b : this.numberButtons) {
            this.add(b);
        }

        String[] operations = {"+", "-", "*", "/", "x²", "√"};
        this.operatorButtons = new ArrayList<>();
        for (String i : operations) {
            this.operatorButtons.add(new KeyPadButton(i));
        }
        for (KeyPadButton b : this.operatorButtons) {
            this.add(b);
        }
    }
}
