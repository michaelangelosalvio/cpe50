package com.cpe50.filemanip;

import com.cpe50.gui.Person;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by msalvio on 17/08/16.
 */
public class NamesTableModel extends AbstractTableModel {
    ArrayList<Person> persons;

    String[] columns = {"First Name", "Last Name"};

    public NamesTableModel(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public int getRowCount() {
        return persons.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if ( columnIndex == 0 ) {
            return persons.get(rowIndex).getFirstName();
        } else {
            return persons.get(rowIndex).getLastName();
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void add(Person person) {

        persons.add(person);
        this.fireTableDataChanged();

    }

    public void remove(int selectedRow) {
        persons.remove(selectedRow);
        this.fireTableDataChanged();
    }
}
