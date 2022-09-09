package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.backend.Converter;
import quaternarycalculator.bsu.edu.frontend.QuaternaryCalculator;

import java.util.Arrays;

public class DigitDisplayController {

    private DigitDisplay display;
    private QuaternaryCalculator mainFrame;
    private String operations[] = new String[5];
    private boolean displayAsBase10 = false;
    private Converter conv = new Converter();


    public DigitDisplayController(QuaternaryCalculator mainFrame) {
        this.mainFrame = mainFrame;
        this.display = new DigitDisplay();
    }
    public void initialize(){
        this.mainFrame.add(this.display);
    }

    public void clear(){
        Arrays.fill(this.operations,null);
        this.display.updateFromArray(operations);
    }

    public void opPressed(String symbol) {
        operations[1] = symbol;
        this.display.updateFromArray(operations);

    }

    public void numPressed(String symbol) {
        if (operations[0] == null){
            operations[0] = symbol;
        }else{
            operations[2] = symbol;
        }
        this.display.updateFromArray(operations);
    }

    public void displayResult(String res){
        operations[3] = "=";
        operations[4] = res;
        this.display.updateFromArray(operations);
    }


}
