package  com.cpe50.entermfirstquiz;


import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class NameTableModel extends AbstractTableModel{
	ArrayList<String> names;
	
	public NameTableModel(ArrayList<String> names){
		this.names = names;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return names.size();
	}

	@Override
	public String getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return names.get(row);
	}
	
	public void setNames(ArrayList<String> names){
		this.names = names;
		this.fireTableDataChanged();
	}
	
	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return "Name";
	}

}
