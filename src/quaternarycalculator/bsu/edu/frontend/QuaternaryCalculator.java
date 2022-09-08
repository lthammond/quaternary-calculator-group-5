package quaternarycalculator.bsu.edu.frontend;

import javax.swing.*;

public class QuaternaryCalculator {

    public QuaternaryCalculator(){

    }
    public void start(){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
}
