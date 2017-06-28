package  com.cpe50.entermfirstquiz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Test extends JFrame implements ActionListener  {
	
	JFrame tableFrame;
	DBConnection db;
	NameTableModel tableModel;
	JTable table;
	JTextField nameField;
	
	public Test(){
		db = new DBConnection();			
		tableFrame = new JFrame();

		nameField = new JTextField(10);
		JButton addButton  = new JButton("Add");
		this.setLayout(new FlowLayout());
		this.add(new JLabel("Name:"));
		this.add(nameField);
		this.add(addButton);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		
		tableModel = new NameTableModel(db.getPersons());
		table = new JTable(tableModel);
		
		tableFrame.add(new JScrollPane(table));
		tableFrame.setVisible(true);
		tableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tableFrame.pack();
		
		addButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		db.addPerson(nameField.getText());
		nameField.setText("");
		tableModel.setNames(db.getPersons());
		
		
	}
	public static void main(String[] args) {			
		System.out.println(Math.random() * 4);

	}	
}
