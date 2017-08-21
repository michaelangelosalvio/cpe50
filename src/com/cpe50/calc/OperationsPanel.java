package com.cpe50.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationsPanel extends JPanel {
    String[] operations = {"C","+/-","+","-","x","/"};
    JButton[] buttons;
    JTextField numField;
    CalcMemory memory;

    public OperationsPanel(CalcMemory memory, JTextField numField){
        buttons = new JButton[operations.length];
        this.numField = numField;
        this.memory = memory;

        this.setLayout(new GridLayout(6,1));

        for ( int i = 0 ; i < buttons.length ; i++ ) {
            buttons[i] = new JButton(operations[i]);
            this.add(buttons[i]);

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();


                    if ( button.getText().equals("C") ) {
                        numField.setText("0");
                    } else if ( button.getText().equals("+/-") ) {
                        numField.setText(String.valueOf(0 - Double.parseDouble(numField.getText())));
                    } else if ( button.getText().equals("/") ) {

                    } else {
                        double ans = memory.setValue(Double.valueOf(numField.getText()),button.getText());
                        numField.setText(String.valueOf(ans));
                    }
                }
            });
        }
    }
}
