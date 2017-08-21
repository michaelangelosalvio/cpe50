package com.cpe50.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsPanel extends JPanel {
    String[] operations = {"7","8","9","4","5","6","1","2","3", "0", ".","="};
    JButton[] buttons;
    JTextField numField;

    public ButtonsPanel(CalcMemory memory, JTextField numField){
        this.numField = numField;
        buttons = new JButton[operations.length];
        this.setLayout(new GridLayout(4,3));

        for ( int i = 0 ; i < buttons.length ; i++ ) {
            buttons[i] = new JButton(operations[i]);
            this.add(buttons[i]);

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton)e.getSource();
                    if ( button.getText().equals(".") ) {

                        if ( memory.isAllowedOverride() ) {
                            numField.setText("0.");
                        } else {
                            if ( !hasDecimal() ) {

                                if ( Double.valueOf(numField.getText()) != 0 ) {
                                    numField.setText(numField.getText() + ".");
                                } else {
                                    numField.setText("0.");
                                }



                            }
                        }

                        memory.setAllowOverride(false);

                    } else if ( button.getText().equals("=") ) {
                        double ans = memory.setValue(Double.valueOf(numField.getText()),button.getText());
                        numField.setText(String.valueOf(ans));
                    } else {
                        if ( memory.isAllowedOverride() ) {
                            numField.setText(button.getText());
                            memory.setAllowOverride(false);


                            if ( button.getText().equals("0") ) {
                                memory.setAllowOverride(true);
                            }


                        } else {

                            if ( !button.getText().equals("0") && !numField.getText().equals("0") ) {
                                numField.setText(numField.getText() + button.getText());
                            } else {

                                /**
                                 * zero field
                                 */

                                if ( numField.getText().equals("0") && button.getText().equals("0") ) {
                                    numField.setText("0");
                                    memory.setAllowOverride(true);
                                } else {
                                    System.out.println("know");
                                    numField.setText(numField.getText() + button.getText());
                                }

                            }

                        }

                    }
                }
            });
        }
    }

    private boolean hasDecimal(){
        String value = numField.getText();
        for ( int i = 0; i < value.length() ; i++ ) {
            if ( value.charAt(i) == '.' ) {
                return true;
            }
        }
        return false;
    }
}
