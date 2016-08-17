package com.cpe50.gui;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by msalvio on 16/08/16.
 */
public class ChatFrame extends JFrame {
    JTextArea textArea;
    JTextField chatField;
    JButton sendButton;
    JPanel chatPanel;

    Container container;

    public ChatFrame(){

        chatField = new JTextField(10);
        sendButton = new JButton("Send");


        chatPanel = new JPanel();
        chatPanel.setLayout(new FlowLayout());
        chatPanel.add(chatField);
        chatPanel.add(sendButton);

        textArea = new JTextArea(10,10);

        container = this.getContentPane();
        container.setLayout(new BorderLayout());

        container.add(textArea, BorderLayout.CENTER);
        container.add(chatPanel, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        chatField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ( e.getKeyCode() == KeyEvent.VK_ENTER ) {
                    System.out.println("Enter");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


    }

    public static void main(String[] args) {
        new ChatFrame();
    }
}