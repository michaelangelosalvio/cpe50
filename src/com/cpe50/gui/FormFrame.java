package com.cpe50.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by msalvio on 14/08/16.
 */
public class FormFrame extends JFrame implements ActionListener {
    JLabel     nameLabel;
    JTextField nameField;
    JButton    saveButton;
    Container  container;


    public FormFrame() {
        init();
        addComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    private void init(){
        this.nameLabel = new JLabel("Name");
        this.nameField = new JTextField(10);
        this.saveButton = new JButton("Save");

        this.saveButton.addActionListener(this);
    }
    private void addComponents(){
        this.container = this.getContentPane();
        this.setLayout(new FlowLayout());
        this.add(this.nameLabel);
        this.add(this.nameField);
        this.add(this.saveButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"You entered " + this.nameField.getText() );
        this.nameField.setText("");
    }
}
