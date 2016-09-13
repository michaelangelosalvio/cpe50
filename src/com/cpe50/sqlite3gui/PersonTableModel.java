package com.cpe50.sqlite3gui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class PersonTableModel extends AbstractTableModel{
	public ArrayList<Person> persons;

	public PersonTableModel(){
		persons = new ArrayList<Person>();
	
	}
	
	@Override
	public String getColumnName(int c) {
		// TODO Auto-generated method stub
		if ( c == 0 ) {
			return "First Name";
		} else {
			return "Last Name";
		}
	}


	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return persons.size();
	}

	@Override
	public String getValueAt(int r, int c) {
		// TODO Auto-generated method stub
		if ( c == 0 ) {
			return persons.get(r).getFirstName();
		} else {
			return persons.get(r).getLastName();
		}
	}
	
	public ArrayList<Person> getPersons() {
		return persons;
	}

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
        this.fireTableDataChanged();
    }
}
