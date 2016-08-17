package com.cpe50.gui;

import com.cpe50.filemanip.NamesTableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TestingFrame extends JFrame implements ActionListener {
    JLabel firstNameLabel, lastNameLabel;
    JTextField firstNameField, lastNameField;
    JButton addButton, removeButton;
    GridBagConstraints constraints;
    Container          container;

    JTable          table;
    NamesTableModel namesTableModel;

    JPanel formPanel, listPanel;

    ArrayList<Person> persons;
    public JButton clearButton;

    public TestingFrame() {
        init();
        setLayout();
        this.setUpComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

    }

    private void setUpComponents() {


        addComponents(formPanel, firstNameLabel, 0, 0, 1,1,GridBagConstraints.NONE,0,0,GridBagConstraints.LINE_START);
        addComponents(formPanel,firstNameField,0,1,1,1,GridBagConstraints.BOTH,0.7,0,GridBagConstraints.CENTER);

        addComponents(formPanel,lastNameLabel,1,0,1,1,GridBagConstraints.NONE,0,0,GridBagConstraints.LINE_START);
        addComponents(formPanel, lastNameField,1,1,1,1,GridBagConstraints.BOTH,0.7,0,GridBagConstraints.CENTER);

        addComponents(formPanel, addButton,2,1,1,1,GridBagConstraints.NONE, 0,0, GridBagConstraints.LINE_START);

        addComponents(container, formPanel,0,0,1,1,GridBagConstraints.BOTH,0,0,GridBagConstraints.CENTER);

        addComponents(listPanel, new JScrollPane(table), 0,0,1,2,GridBagConstraints.BOTH,0.7,0,GridBagConstraints.CENTER);
        addComponents(listPanel, removeButton, 0,1,1,1,GridBagConstraints.HORIZONTAL,0,0,GridBagConstraints.PAGE_START);
        addComponents(listPanel, clearButton, 1,1,1,1,GridBagConstraints.HORIZONTAL,0,0,GridBagConstraints.PAGE_START);

        addComponents(container, listPanel,1,0);



        /*addComponents(addButton,2,1);

        addComponents(new JScrollPane(list),3,0,2,2,GridBagConstraints.BOTH, 0.2,0.2);

        addComponents(removeButton,3,2);
        addComponents(clearButton,4,2);*/

    }

    private void init() {
        container = this.getContentPane();
        persons = new ArrayList<Person>();
        formPanel = new JPanel();
        listPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        listPanel.setLayout(new GridBagLayout());

        firstNameLabel = new JLabel("First Name :");
        firstNameField = new JTextField(10);
        lastNameLabel = new JLabel("Last Name : ");
        lastNameField = new JTextField(10);

        addButton = new JButton("Add");

        namesTableModel = new NamesTableModel(persons);
        table = new JTable(namesTableModel);

        removeButton = new JButton("Remove");
        clearButton = new JButton("Clear");

        addButton.addActionListener(this);
        removeButton.addActionListener(this);
        clearButton.addActionListener(this);

    }

    private void setLayout() {
        this.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();


    }

    private void addComponents(Container container, Component component, int gridy, int gridx) {
        constraints.gridx = gridx;
        constraints.gridy = gridy;

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;

        constraints.weightx = 0;
        constraints.weighty = 0;

        constraints.anchor = GridBagConstraints.CENTER;

        container.add(component,constraints);

    }

    private void addComponents(Container container, Component component, int gridy, int gridx,int gridwidth, int gridheight ) {
        constraints.gridx = gridx;
        constraints.gridy = gridy;

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;

        constraints.weightx = 0;
        constraints.weighty = 0;

        constraints.anchor = GridBagConstraints.CENTER;

        container.add(component,constraints);


    }

    private void addComponents(Container container, Component component, int gridy, int gridx, int gridwidth, int gridheight, int fill, double weightx, double weighty) {
        constraints.gridx = gridx;
        constraints.gridy = gridy;

        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;

        constraints.fill = fill;

        constraints.weightx = weightx;
        constraints.weighty = weighty;

        constraints.anchor = GridBagConstraints.CENTER;

        container.add(component,constraints);

    }

    private void addComponents(Container container, Component component, int gridy, int gridx, int gridwidth, int gridheight, int fill, double weightx, double weighty, int anchor) {
        constraints.gridx = gridx;
        constraints.gridy = gridy;

        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;

        constraints.fill = fill;

        constraints.weightx = weightx;
        constraints.weighty = weighty;

        constraints.anchor = anchor;

        container.add(component,constraints);

    }


    public static void main(String[] args) {
        new TestingFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == addButton ) {

            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();

            Person person  = new Person(firstName, lastName);
            namesTableModel.add(person);

        } else if ( e.getSource() == removeButton ) {
            namesTableModel.remove(table.getSelectedRow());


        } else if ( e.getSource() == clearButton ) {

        }
    }
}
