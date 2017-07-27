package com.cpe50.s20170726;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name = input.nextLine();
		Person p = new Person(name);
		ArrayList<Person> friends = new ArrayList<Person>();
		
		String option;
		do {
			System.out.print("Enter friend's name:");
			String friendName = input.nextLine();
			friends.add(new Person(friendName));
			System.out.print("Continue? (Y/N):");
			option = input.nextLine();
			
		} while ( option.equals("y") );


        p.setFriends(friends);

		
		for ( int i = 0 ; i < p.getFriends().size() ; i++ ) {
			System.out.print("Would you like to remove " + p.getFriends().get(i).getName() + " ?");
			String removeOption = input.nextLine();
			if ( removeOption.equals("y") ) {
				p.getFriends().remove(i);
				i--;
			}
		}
		

		
		System.out.println("Name : " + p.getName());
		
		for ( int i = 0 ; i < p.getFriends().size() ; i++ ) {
			System.out.println(p.getFriends().get(i).getName());
		}
		
	}
}
