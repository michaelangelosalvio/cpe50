package com.cpe50.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by msalvio on 14/08/16.
 */
public class CalcFrame extends JFrame {
    JPanel    buttonsPanel;
    JTextField field;
    Container container;

    public CalcFrame() {
        init();
        addComponents();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }

    private void init() {
        this.container = this.getContentPane();
        this.buttonsPanel = new JPanel();
        this.buttonsPanel.setLayout(new GridLayout(4,4));
        this.field = new JTextField(10);


    }

    private void addComponents() {
        this.buttonsPanel.add(new JButton("7"));
        this.buttonsPanel.add(new JButton("8"));
        this.buttonsPanel.add(new JButton("9"));
        this.buttonsPanel.add(new JButton("+"));

        this.buttonsPanel.add(new JButton("4"));
        this.buttonsPanel.add(new JButton("5"));
        this.buttonsPanel.add(new JButton("6"));
        this.buttonsPanel.add(new JButton("-"));

        this.buttonsPanel.add(new JButton("1"));
        this.buttonsPanel.add(new JButton("2"));
        this.buttonsPanel.add(new JButton("3"));
        this.buttonsPanel.add(new JButton("*"));

        this.buttonsPanel.add(new JButton("0"));
        this.buttonsPanel.add(new JButton("."));
        this.buttonsPanel.add(new JButton("/"));
        this.buttonsPanel.add(new JButton("="));

        container.add(this.field, BorderLayout.NORTH);
        container.add(this.buttonsPanel,BorderLayout.CENTER);

    }


}
