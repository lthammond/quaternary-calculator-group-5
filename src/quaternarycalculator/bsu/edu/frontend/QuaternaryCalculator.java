package quaternarycalculator.bsu.edu.frontend;


import quaternarycalculator.bsu.edu.backend.Converter;
import quaternarycalculator.bsu.edu.backend.Operator;
import quaternarycalculator.bsu.edu.frontend.digitdisplay.DigitDisplayController;
import quaternarycalculator.bsu.edu.frontend.keypad.KeyPadController;

import javax.swing.*;
import java.util.ArrayList;

public class QuaternaryCalculator extends JFrame{

    ArrayList<String> numbers = new ArrayList<>();
    private DigitDisplayController digitDisplay;
    private KeyPadController keyPad;
    private Operator backend;

    private Converter converter;
    private Footer footer;
    private String op;

    private boolean decimalMode = false;

    public QuaternaryCalculator(){

        this.backend = new Operator();
        this.setSize(600, 800);

        digitDisplay = new DigitDisplayController(this);
        digitDisplay.initialize();

        keyPad = new KeyPadController(this);
        keyPad.initialize();

        footer = new Footer(this);
        footer.initialize();
        this.pack();// this will override the setSize and auto adjust size to elements
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void numberButtonPressed(String symbol){
        //System.out.println(symbol);
        digitDisplay.addCharacterToDisplay(symbol);
        int pos;
        if (this.op == null){
            pos = 0;
        }else{
            pos = 1;
        }

        if(this.numbers.isEmpty() && pos == 0){
            this.numbers.add(symbol);
        }else if(this.numbers.size()==1 && pos ==0){
            this.numbers.set(pos,this.numbers.get(pos)+symbol);
        }else if(this.numbers.size()==2){
            this.numbers.set(pos,this.numbers.get(pos)+symbol);
        }else{
            this.numbers.add(symbol);
        }


    }

    public void operatorButtonPressed(String symbol){
        if(this.op==null){
            digitDisplay.addCharacterToDisplay(symbol);
            this.op = symbol;
        }
    }
    public void resultRequested(){

        digitDisplay.clear();
        digitDisplay.displayResult(this.backend.doOperation(this.op,numbers));
    }

    public void requestedClearScreen() {
        numbers.clear();
        this.op = null;
        digitDisplay.clear();

    }

    public void toggleResultBase(){
        Converter converter = new Converter();
        String result = this.backend.doOperation(this.op, numbers);
        decimalMode = !decimalMode;
        if(decimalMode) {
            digitDisplay.clear();
            digitDisplay.displayResult(String.valueOf(converter.convertToDecimal(result)));
        } else {
            digitDisplay.clear();
            digitDisplay.displayResult(result);
        }
    }
}
