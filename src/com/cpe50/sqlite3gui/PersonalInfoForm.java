package com.cpe50.sqlite3gui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PersonalInfoForm extends JFrame implements ActionListener
{
	JLabel firstNameLabel, lastNameLabel;
	JTextField firstNameField, lastNameField;
	JButton saveButton, modifyButton, deleteButton;
    JTable           personsTable;
    PersonTableModel personsTableModel;
    EditPersonalInfoForm editPersonalInfoForm;

    /**
     * declare data model here
     */
    PersonsDataModel model;

    Container          container;
    GridBagLayout      layout;
    GridBagConstraints constraints;


    public PersonalInfoForm() {
        init();
        addComponents();
        model.updateTableUI();

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
		
		this.container.add(modifyButton,this.constraints);
		
		this.constraints.gridx = 3;
		this.constraints.gridy = 2;
		this.constraints.anchor = GridBagConstraints.LINE_START;
		
		this.container.add(deleteButton,this.constraints);
		
		
		this.constraints.gridx = 0;
		this.constraints.gridy = 3;
		this.constraints.gridwidth = 4;
		this.constraints.fill = GridBagConstraints.BOTH;
		
		this.container.add(new JScrollPane(personsTable),this.constraints);
		
		saveButton.addActionListener(this);
		modifyButton.addActionListener(this);
		deleteButton.addActionListener(this);

        editPersonalInfoForm.deleteButton.addActionListener(this);
        editPersonalInfoForm.saveButton.addActionListener(this);

		
	}
	
	private void init(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstNameLabel  = new JLabel("First Name");
		lastNameLabel = new JLabel("Last Name");
		
		firstNameField = new JTextField(20);
		lastNameField = new JTextField(20);
		
		saveButton = new JButton("Save");
		modifyButton = new JButton("Modify");
		deleteButton = new JButton("Delete");
		
		this.container = this.getContentPane();
		this.layout = new GridBagLayout();
		this.constraints = new GridBagConstraints();
		
		this.personsTableModel = new PersonTableModel();
		this.personsTable = new JTable(personsTableModel);

		
		model = new PersonsDataModel(this.personsTable);
        editPersonalInfoForm = new EditPersonalInfoForm();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		if ( e.getSource() == saveButton ) {
			String firstName = firstNameField.getText();
			String lastName  = lastNameField.getText();

            /**
             * add student to database
             */
			model.addPerson(firstName, lastName);

            firstNameField.setText("");
            lastNameField.setText("");

            model.updateTableUI();

        } else if ( e.getSource() == deleteButton ) {
            if (personsTable.getSelectedRow() > -1 ) {
                Person p = personsTableModel.getPersons().get(personsTable.getSelectedRow());
                model.deletePerson(p.getId());
            } else {
                JOptionPane.showMessageDialog(null,"Please select a person");
            }

        } else if ( e.getSource() == modifyButton ) {
            if (personsTable.getSelectedRow() > -1 ) {
                Person p = personsTableModel.getPersons().get(personsTable.getSelectedRow());
                editPersonalInfoForm.setPerson(p);
            } else {
                JOptionPane.showMessageDialog(null,"Please select a person");
            }
        } else if ( e.getSource() == editPersonalInfoForm.saveButton ) {
            Person p = editPersonalInfoForm.getPerson();
            String first_name = editPersonalInfoForm.firstNameField.getText();
            String last_name = editPersonalInfoForm.lastNameField.getText();
            model.updatePerson(p.getId(),first_name, last_name);
            editPersonalInfoForm.setVisible(false);
        } else if ( e.getSource() == editPersonalInfoForm.deleteButton ) {
            Person p = editPersonalInfoForm.getPerson();
            model.deletePerson(p.getId());
            editPersonalInfoForm.setVisible(false);
        }

		
	}


    public static void main(String[] args) {
        new PersonalInfoForm();
    }

	

}













