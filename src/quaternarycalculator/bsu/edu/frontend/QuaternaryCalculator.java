package quaternarycalculator.bsu.edu.frontend;


import quaternarycalculator.bsu.edu.backend.Operator;
import quaternarycalculator.bsu.edu.frontend.digitdisplay.DigitDisplayController;
import quaternarycalculator.bsu.edu.frontend.keypad.KeyPadController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QuaternaryCalculator extends JFrame{

    ArrayList<String> numbers = new ArrayList<>();
    private DigitDisplayController digitDisplay;
    private KeyPadController keyPad;
    private Operator backend;
    private String op;

    public QuaternaryCalculator(){
        this.backend = new Operator();
        this.setSize(600, 800);

        digitDisplay = new DigitDisplayController(this);
        digitDisplay.initialize();

        keyPad = new KeyPadController(this);
        keyPad.initialize();

        Footer footer = new Footer(this);
        footer.initialize();
        //this.pack(); this will override the setSize and auto adjust size to elements
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void numberButtonPressed(String symbol){
        //System.out.println(symbol);
        digitDisplay.numPressed(symbol);
        this.numbers.add(symbol);
    }

    public void operatorButtonPressed(String symbol){
        digitDisplay.opPressed(symbol);
        this.op = symbol;
    }
    public void resultRequested(){
        digitDisplay.displayResult(this.backend.doOperation(this.op,numbers));
    }

    public void requestedClearScreen() {
        numbers.clear();
        this.op = null;
        digitDisplay.clear();

    }
}
