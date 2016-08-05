import java.io.ObjectInputStream.GetField;


public class TestRoom {
	public static void main(String[] args) {
		Room room = new Room(2500);
		System.out.println(room.getRoomRate());
		
		Suites suites = new Suites(3000);
		System.out.println(suites.getRoomRate());
	}
}
