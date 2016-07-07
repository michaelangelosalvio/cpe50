package com.cpe50.arraylist;

import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) {
        Person[] persons;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter # of persons:");
        int num_persons = input.nextInt();
        input.nextLine();

        persons = new Person[num_persons];

        /**
         * Get number of persons
         */

        for ( int i = 0 ; i < persons.length ; i++ ){
            System.out.print("Enter First name of Person# " + (i+1) +" :");
            String firstName = input.nextLine();

            System.out.print("Enter Last name of Person# " + (i+1) +" :");
            String lastName = input.nextLine();

            System.out.print("Enter # of siblings :");
            int num_siblings = input.nextInt();
            input.nextLine();


            Person[] siblings;

            siblings = new Person[num_siblings];

            if ( num_siblings > 0 ){
                siblings = new Person[num_siblings];
            } else {
                siblings = new Person[0];
            }


            for( int j = 0 ; j < siblings.length ; j++ ) {
                System.out.print("Enter First name:");
                String siblingFirstName = input.nextLine();

                System.out.print("Enter Last name:");
                String siblingLastName = input.nextLine();

                siblings[j] = new Person();
                siblings[j].setFirstName(siblingFirstName);
                siblings[j].setLastName(siblingLastName);

            }

            persons[i] = new Person(firstName, lastName, siblings);


        }

        /**
         * displaying
         */

        for ( int i = 0 ; i < persons.length ; i++ ) {

            System.out.println("Person #" + (i+1) + ": " + persons[i]);

            if ( persons[i].getSiblings().length > 0 ) {
                for ( int j = 0 ; j < persons[i].getSiblings().length ; j++ ) {
                    Person s = persons[i].getSiblings()[j];
                    System.out.println("Sibling #" + (j+1) + ": " + s);
                }
            } else {

                System.out.println("Person #" + (i+1) + " has no siblings");
            }


        }


    }

}
