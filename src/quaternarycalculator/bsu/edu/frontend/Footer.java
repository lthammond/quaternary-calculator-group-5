package quaternarycalculator.bsu.edu.frontend;

import javax.swing.*;

public class Footer extends JPanel {
    private JButton submit;
    private JButton clear;
    public Footer(){
        this.submit = new JButton("=");
        this.clear = new JButton("CC");

        this.add(this.clear);
        this.add(this.submit);
    }
}
