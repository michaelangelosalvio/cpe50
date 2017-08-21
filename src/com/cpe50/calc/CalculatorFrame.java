package com.cpe50.calc;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    ButtonsPanel buttonsPanel;
    OperationsPanel operationsPanel;
    JTextField   numField;
    Container    container;
    CalcMemory memory;

    public CalculatorFrame() {
        init();
        addComponents();

        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void init() {

        memory = new CalcMemory();
        container = this.getContentPane();
        numField = new JTextField(10);

        buttonsPanel = new ButtonsPanel(memory, numField);
        operationsPanel = new OperationsPanel(memory, numField);


        numField.setHorizontalAlignment(SwingConstants.RIGHT);
        numField.setEditable(false);
        numField.setText("0");
    }

    private void addComponents() {
        this.add(buttonsPanel,BorderLayout.CENTER);
        this.add(numField, BorderLayout.NORTH);
        this.add(operationsPanel, BorderLayout.EAST);
    }

}
