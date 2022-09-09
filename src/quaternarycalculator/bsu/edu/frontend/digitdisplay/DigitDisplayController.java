package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.frontend.QuaternaryCalculator;

public class DigitDisplayController {

    private DigitDisplay display;
    private QuaternaryCalculator mainFrame;
    private String operations[] = new String[3];

    public DigitDisplayController(QuaternaryCalculator mainFrame) {
        this.mainFrame = mainFrame;
        this.display = new DigitDisplay();
    }
    public void initialize(){
        this.mainFrame.add(this.display);
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
}
