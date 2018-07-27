package com.cpe50_1st_sem_20182019;

import java.util.Scanner;



public class TestPerson {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter # of Persons:");
		int num_person = input.nextInt();
		input.nextLine();

		Person[] persons = new Person[num_person];
		for ( int i = 0 ; i < persons.length ; i++ ) {
			//persons[i] = new Person();
			System.out.print("Enter name of Person #" + (i+1) + ":");
			String name = input.nextLine();			
			System.out.print("Enter # of Pets of Person #" + (i+1) + ": ");
			int num_pets = input.nextInt();
			input.nextLine();		
			//persons[i].setPets(new Pet[num_pets]);
			
			persons[i] = new Person(name,new Pet[num_pets]);
			
			for ( int  j = 0 ; j < persons[i].getPets().length ; j++ ) {
				persons[i].getPets()[j] = new Pet();
				System.out.print("Enter Pet#" + (j+1) + " of " + persons[i].getName() + ": ");
				persons[i].getPets()[j].setName(input.nextLine());
			}
		}
		
		display(persons);
	}
	
	public static void display(Person[] persons){
		
		/*for ( int i = 0; i < persons.length ; i++ ) {
			System.out.println("Person #"+ (i+1) +"'s name : " + persons[i].getName());
			for ( int j = 0 ; j < persons[i].getPets().length ; j++) {
				System.out.println("\tPet#"+ (j+1) +"'s name : " + persons[i].getPets()[j].getName());
			}
			System.out.println("----------------------");			
		}*/
		
		for ( int i = 0; i < persons.length ; i++ ) {
			System.out.println("Person #"+ (i+1) +":");
			System.out.println(persons[i]);		
			System.out.println("----------------------");			
		}
	}

}













