
public class Student extends Person {
	private String idNumber;
	
	public Student(String firstName, String lastName){
		super.setFirstName(firstName);
		super.setLastName(lastName);
	}
	
	public Student(String firstName, String lastName, String idNumber){
		//super.setFirstName(firstName);
		//super.setLastName(lastName);
		super(firstName, lastName);
		this.idNumber = idNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		super.sing();
		System.out.println("tratra");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nID Number " + idNumber;
	}
}
