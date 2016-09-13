package com.cpe50.sqlite3gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EditPersonalInfoForm extends JFrame implements ActionListener
{
	JLabel firstNameLabel, lastNameLabel;
	JTextField firstNameField, lastNameField;
	JButton saveButton, cancelButton, deleteButton;

    /**
     * declare data model here
     */

    Container          container;
    GridBagLayout      layout;
    GridBagConstraints constraints;

    Person person;


    public EditPersonalInfoForm() {
        init();
        addComponents();


        this.pack();
    }

    private void addComponents() {
        this.container.setLayout(this.layout);

        this.constraints.gridx = 0;
        this.constraints.gridy = 0;
        this.constraints.insets = new Insets(2, 2, 2, 2);

        this.container.add(firstNameLabel, this.constraints);

        this.constraints.gridx = 1;
        this.constraints.gridy = 0;
        this.constraints.gridwidth = 3;
        this.constraints.anchor = GridBagConstraints.LINE_START;
		this.constraints.fill = GridBagConstraints.HORIZONTAL;		
		this.container.add(firstNameField,this.constraints);
		
		this.constraints.gridx = 0;
		this.constraints.gridy = 1;
		this.constraints.gridwidth = 1;
		this.constraints.fill = GridBagConstraints.NONE;
		this.container.add(lastNameLabel,this.constraints);
		
		this.constraints.gridx = 1;
		this.constraints.gridy = 1;
		this.constraints.gridwidth = 3;
		this.constraints.anchor = GridBagConstraints.LINE_START;
		this.constraints.fill = GridBagConstraints.HORIZONTAL;
		
		this.container.add(lastNameField,this.constraints);
		
		this.constraints.gridx = 1;
		this.constraints.gridy = 2;
		this.constraints.gridwidth = 1;
		this.constraints.fill = GridBagConstraints.NONE;
		this.constraints.anchor = GridBagConstraints.LINE_START;
		
		this.container.add(saveButton,this.constraints);
		
		this.constraints.gridx = 2;
		this.constraints.gridy = 2;
		this.constraints.anchor = GridBagConstraints.LINE_START;
		
		this.container.add(deleteButton,this.constraints);
		
		this.constraints.gridx = 3;
		this.constraints.gridy = 2;
		this.constraints.anchor = GridBagConstraints.LINE_START;
		
		this.container.add(cancelButton,this.constraints);
		
		
		this.constraints.gridx = 0;
		this.constraints.gridy = 3;
		this.constraints.gridwidth = 4;
		this.constraints.fill = GridBagConstraints.BOTH;
		
	}
	
	private void init(){
		this.setVisible(false);

		firstNameLabel  = new JLabel("First Name");
		lastNameLabel = new JLabel("Last Name");
		
		firstNameField = new JTextField(20);
		lastNameField = new JTextField(20);
		
		saveButton = new JButton("Save");
		cancelButton = new JButton("Cancel");
		deleteButton = new JButton("Delete");
		
		this.container = this.getContentPane();
		this.layout = new GridBagLayout();
		this.constraints = new GridBagConstraints();

		
		cancelButton.addActionListener(this);

	}

    public void setPerson(Person person){
        this.person = person;

        this.lastNameField.setText(person.getLastName());
        this.firstNameField.setText(person.getFirstName());
        this.setVisible(true);

    }

    public Person getPerson() {
        return person;
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		if ( e.getSource() == cancelButton ) {
            this.setVisible(false);
		}
		
		
	}

}













