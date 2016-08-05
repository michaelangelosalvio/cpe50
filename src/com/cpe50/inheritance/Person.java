import java.util.ArrayList;


public class Person {
	private String firstName, lastName;
	private ArrayList<Person> siblings;
	
	public Person(){
		
	}
	
	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		siblings = new ArrayList<Person>();
	}

	public ArrayList<Person> getSiblings() {
		return siblings;
	}

	public void setSiblings(ArrayList<Person> siblings) {
		this.siblings = siblings;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void sing(){
		System.out.println("lalala");
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.lastName + ", " + this.firstName;
	}
	
	
}
