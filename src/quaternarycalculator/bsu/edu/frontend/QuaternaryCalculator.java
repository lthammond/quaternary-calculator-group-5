package quaternarycalculator.bsu.edu.frontend;

import quaternarycalculator.bsu.edu.frontend.digitdisplay.DigitDisplay;
import quaternarycalculator.bsu.edu.frontend.keypad.KeyPad;

import javax.swing.*;

public class QuaternaryCalculator extends JFrame{

    public QuaternaryCalculator(){
        this.setSize(600, 800);

        DigitDisplay digitDisplay = new DigitDisplay();
        this.add(digitDisplay);


        KeyPad keyPad = new KeyPad();
        this.add(keyPad);



        //this.pack(); this will override the setSize and auto adjust size to elements
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
