package com.cpe50.sqlite3gui;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

/**
 * Created by msalvio on 17/09/16.
 */
public class Test {
    public static void main(String[] args) {
        JFrame inputFrame = new JFrame();
        JFrame tableFrame = new JFrame();

        inputFrame.setLayout(new FlowLayout());
        inputFrame.add(new JLabel("Name:"));
        inputFrame.add(new JTextField(10));
        inputFrame.add(new JButton("Add"));
        inputFrame.pack();

        inputFrame.setVisible(true);
        inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable myTable = new JTable(new AbstractTableModel() {
            @Override
            public String getColumnName(int column) {
                return "Name";
            }

            @Override
            public int getRowCount() {
                return 0;
            }

            @Override
            public int getColumnCount() {
                return 1;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                return null;
            }
        });

        tableFrame.add(new JScrollPane(myTable));
        tableFrame.setVisible(true);
        tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tableFrame.pack();



    }
}


