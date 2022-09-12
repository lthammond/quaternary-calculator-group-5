package quaternarycalculator.bsu.edu.frontend.digitdisplay;

import quaternarycalculator.bsu.edu.frontend.QuaternaryCalculator;


public class DigitDisplayController {
    private DigitDisplay display;
    private QuaternaryCalculator mainFrame;

    public DigitDisplayController(QuaternaryCalculator mainFrame) {
        this.mainFrame = mainFrame;

        this.display = new DigitDisplay();
    }
    public void initialize(){
        this.mainFrame.add(this.display);
    }

    public void clear(){
        this.display.clear();
    }

    public void addCharacterToDisplay(String symbol) {
        this.display.updateDisplayContent(symbol);
    }

    public void displayResult(String res){
        addCharacterToDisplay("=");
        addCharacterToDisplay(res);
    }
}
