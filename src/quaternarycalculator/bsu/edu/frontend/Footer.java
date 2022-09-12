package quaternarycalculator.bsu.edu.frontend;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Footer extends JPanel {
    private final JButton submit;
    private final JButton clear;
    private final JButton toggle;
    private final QuaternaryCalculator mainFrame;
    public Footer(QuaternaryCalculator mainFrame){
        this.submit = new JButton("=");
        this.clear = new JButton("CC");
        this.toggle = new JButton("Toggle Decimal");
        toggle.setEnabled(false);
        this.mainFrame = mainFrame;
        this.add(this.clear);
        this.add(this.submit);
        this.add(this.toggle);
    }

    public void initialize(){
        this.setBackground(Color.DARK_GRAY);
        this.mainFrame.add(this);
        this.submit.addActionListener(e -> {
            String status = mainFrame.resultRequested();
            if (Objects.equals(status, "pass")) {
                toggle.setEnabled(true);
                submit.setEnabled(false);
            }
        });
        this.clear.addActionListener(e -> {
            mainFrame.requestedClearScreen();
            submit.setEnabled(true);
            toggle.setEnabled(false);
        });
        this.toggle.addActionListener(e -> {
            mainFrame.toggleResultBase();
            if (mainFrame.decimalMode) {
                clear.setEnabled(false);
                toggle.setText("Toggle Quaternary");
            } else {
                clear.setEnabled(true);
                toggle.setText("Toggle Decimal");
            }
        });
    }
}
