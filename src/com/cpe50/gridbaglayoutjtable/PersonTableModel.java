import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;


public class PersonTableModel extends AbstractTableModel{
	private ArrayList<Person> persons;
	
	public PersonTableModel(){
		persons = new ArrayList<Person>();
		/*persons.add( new Person("Foo", "Bar"));
		persons.add( new Person("Fu", "Si"));
		persons.add( new Person("John", "Doe"));
		persons.add( new Person("Jill", "Ben"));*/
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
	public String getValueAt(int y, int x) {
		// TODO Auto-generated method stub
		Person person  = persons.get(y);
		
		if ( x == 0) {
			return person.getFirstName();
		} else {
			return person.getLastName();
		}
				
	}
	
	@Override
	public String getColumnName(int x) {
		if ( x == 0 ) {
			return "FIRST NAME";
 		} else {
 			return "LAST NAME";
 		}
	}
	
	public void addPerson(Person person){
		persons.add(person);
		this.fireTableDataChanged();
	}
	
	public void clear(){
		persons.clear();
		this.fireTableDataChanged();
	}
	
	public void remove(int row){
		if ( row >= 0 ) {
			persons.remove(row);
			this.fireTableDataChanged();
		}
		
	}

	

}
