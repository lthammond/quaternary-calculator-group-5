package quaternarycalculator.bsu.edu.frontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Footer extends JPanel {
    private JButton submit;
    private JButton clear;
    private QuaternaryCalculator mainFrame;
    public Footer(QuaternaryCalculator mainFrame){
        this.submit = new JButton("=");
        this.clear = new JButton("CC");
        this.mainFrame = mainFrame;
        this.add(this.clear);
        this.add(this.submit);
    }
    public void initialize(){
        this.mainFrame.add(this);

        this.submit.addActionListener(e -> mainFrame.resultRequested());
        this.clear.addActionListener(e -> mainFrame.requestedClearScreen());
    }

}
