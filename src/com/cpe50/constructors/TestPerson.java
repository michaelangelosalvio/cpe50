package com.cpe50.constructors;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter # of Persons:");
        int num = input.nextInt();
        input.nextLine();

        Person[] persons = new Person[num];

        for ( int i = 0 ; i < persons.length ; i++ ) {
            System.out.print("Enter First Name for Person # "+ (i+1) +":");
            String firstName = input.nextLine();
            System.out.print("Enter Last Name for Person # "+ (i+1) +":");
            String lastName = input.nextLine();
            persons[i] = new Person(firstName,lastName);
        }

        for ( int i = 0 ; i < persons.length ; i++ ) {
            System.out.println("Person # " + (i + 1));
            System.out.println(persons[i].getLastName() + ", " + persons[i].getFirstName());
        }



    }
}
