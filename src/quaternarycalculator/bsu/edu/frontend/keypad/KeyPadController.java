package quaternarycalculator.bsu.edu.frontend.keypad;

import quaternarycalculator.bsu.edu.frontend.QuaternaryCalculator;
import quaternarycalculator.bsu.edu.frontend.keypad.buttons.KeyPadButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPadController {

    private QuaternaryCalculator mainFrame;
    private KeyPad keyPad;
    public KeyPadController(QuaternaryCalculator mainFrame){
        this.mainFrame = mainFrame;
        this.keyPad = new KeyPad();
    }

    public void initialize(){
        this.mainFrame.add(this.keyPad);
        this.setNumberButtonEvent();
        this.setOperatorButtonEvent();
    }

    private void setNumberButtonEvent(){
        for (KeyPadButton btn : this.keyPad.getNumberButtons()){
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainFrame.numberButtonPressed(btn.getSymbol());
                }
            });
        }
    }
    public void setOperatorButtonEvent(){
        for (KeyPadButton btn : this.keyPad.getOperatorButtons()){
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainFrame.operatorButtonPressed(btn.getSymbol());
                }
            });
        }
    }
}
