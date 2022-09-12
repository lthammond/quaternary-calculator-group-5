package quaternarycalculator.bsu.edu.frontend.keypad;

import quaternarycalculator.bsu.edu.frontend.keypad.buttons.KeyPadButton;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class KeyPad extends JPanel {
    private final ArrayList<KeyPadButton> operatorButtons;
    private final ArrayList<KeyPadButton> numberButtons;

    public ArrayList<KeyPadButton> getOperatorButtons() {
        return operatorButtons;
    }
    public ArrayList<KeyPadButton> getNumberButtons() {
        return numberButtons;
    }

    public KeyPad() {
        String[] numbers = {"0", "1", "2", "3"};
        this.setLayout(new GridLayout(3,4));
        this.numberButtons = new ArrayList<>();
        for (String i :numbers){
            this.numberButtons.add(new KeyPadButton(i));
        }
        for (KeyPadButton b : this.numberButtons){
            b.setPreferredSize(new Dimension(25, 75));

            b.setFont(new Font("Serif",Font.BOLD,40));
            this.add(b);
        }

        String[] operations = {"+", "-", "*", "/", "x²", "√"};
        this.operatorButtons = new ArrayList<>();
        for (String i : operations) {
            this.operatorButtons.add(new KeyPadButton(i));
        }
        for (KeyPadButton b : this.operatorButtons) {
            b.setFont(new Font("Serif",Font.BOLD,40));
            this.add(b);
        }
        this.setBackground(Color.DARK_GRAY);
    }
}
