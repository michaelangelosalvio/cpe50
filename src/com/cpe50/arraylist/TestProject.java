package com.cpe50.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("a","a"));
        persons.add(new Person("b","b"));
        persons.add(new Person("c","c"));
        persons.add(new Person("d","d"));
        persons.add(new Person("e","e"));
        persons.add(new Person("f","f"));


        for ( int i = 0 ; i < persons.size() ; i++ ) {
            System.out.println(persons.get(i));
        }

        persons.remove(2);

        for ( int i = 0 ; i < persons.size() ; i++ ) {
            System.out.println(persons.get(i));
        }


		/*String barcode;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter barcode : ");
		barcode = input.nextLine();

		if ( barcode.equals("a") ) {
			System.out.println("You have entered 'a'");
		} else {
			System.out.println("You have entered another value");
		}*/


    }

}