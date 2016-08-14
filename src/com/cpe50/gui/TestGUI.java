package com.cpe50.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Frame");
        JLabel nameLabel = new JLabel("Enter Name");
        JButton submitButton = new JButton("Save");
        JTextField nameField = new JTextField(10);

        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(nameLabel);
        container.add(nameField);
        container.add(submitButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your name is " + nameField.getText());
                nameField.setText("");
            }
        });
    }
}
