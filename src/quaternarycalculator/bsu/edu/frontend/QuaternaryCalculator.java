package quaternarycalculator.bsu.edu.frontend;


import org.w3c.dom.ls.LSOutput;
import quaternarycalculator.bsu.edu.frontend.digitdisplay.DigitDisplay;
import quaternarycalculator.bsu.edu.frontend.digitdisplay.DigitDisplayController;
import quaternarycalculator.bsu.edu.frontend.keypad.KeyPad;
import quaternarycalculator.bsu.edu.frontend.keypad.KeyPadController;

import javax.swing.*;

public class QuaternaryCalculator extends JFrame{

    private DigitDisplayController digitDisplay;
    private KeyPadController keyPad;

    public QuaternaryCalculator(){
        this.setSize(600, 800);

        digitDisplay = new DigitDisplayController(this);
        digitDisplay.initialize();

        keyPad = new KeyPadController(this);
        keyPad.initialize();

        Footer footer = new Footer();
        this.add(footer);
        //this.pack(); this will override the setSize and auto adjust size to elements
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void numberButtonPressed(String symbol){
        System.out.println(symbol);
        digitDisplay.numPressed(symbol);
    }

    public void operatorButtonPressed(String symbol){
        digitDisplay.opPressed(symbol);
    }
}
