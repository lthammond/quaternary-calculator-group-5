package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.backend.Converter;
import quaternarycalculator.bsu.edu.frontend.QuaternaryCalculator;

import javax.swing.*;
import java.util.Arrays;

public class DigitDisplayController {

    private DigitDisplay display;
    private QuaternaryCalculator mainFrame;
    private boolean displayAsBase10 = false;

    private JButton toggleBtn;
    public DigitDisplayController(QuaternaryCalculator mainFrame) {
        this.mainFrame = mainFrame;
        this.toggleBtn = new JButton("Toggle base10");
        this.display = new DigitDisplay();
    }
    public void initialize(){
        this.mainFrame.add(this.display);

        this.mainFrame.add(this.toggleBtn);

        toggleBtn.addActionListener(e -> this.mainFrame.toggleResultBase());
    }

    public void clear(){
        this.display.clear();
    }


    public void addCharacterToDisplay(String symbol) {
        this.display.updateLabel(symbol);
    }

    public void displayResult(String res){
        addCharacterToDisplay("=");
        addCharacterToDisplay(res);
    }


}
