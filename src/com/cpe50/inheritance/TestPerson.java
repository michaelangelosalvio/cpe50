import java.util.ArrayList;

import javax.swing.JOptionPane;


public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> persons  = new ArrayList<Person>();
		
		int person_counter = 0;
		do {
			String firstName = JOptionPane.showInputDialog("Please enter first name");
			String lastName = JOptionPane.showInputDialog("Please enter last name");
			persons.add(new Person(firstName, lastName));
			
			while( JOptionPane.showConfirmDialog(null, "Enter sibling?") == JOptionPane.YES_OPTION ){
				String siblingFirstName = JOptionPane.showInputDialog("Please enter sibling first name");
				String siblingLastName = JOptionPane.showInputDialog("Please enter sibling last name");
				
				persons.get(person_counter).getSiblings().add(new Person(siblingFirstName, siblingLastName));
			}
			
			person_counter++;
			
		} while (JOptionPane.showConfirmDialog(null, "Would you like to add another person") == JOptionPane.YES_OPTION);
		
		
		
		String content = "";
		for ( Person person : persons ){
			content += person + "\n";
			if ( person.getSiblings().size() <= 0 ) {
				content += "\t - No Sibling \n";
			} else {
				for( Person sibling : person.getSiblings() ) {
					content += "\t -" + sibling + "\n";
				}
			}
			
		}
		
		JOptionPane.showMessageDialog(null, content);

	}

}
