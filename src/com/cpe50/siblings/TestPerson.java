package com.cpe50.siblings;


import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Enter # of Persons:");
        int num_persons = input.nextInt();
        input.nextLine();

        Person[] persons = new Person[num_persons];

        for ( int i = 0 ; i < num_persons ; i++ ) {
            System.out.print("Enter First Name for Person #" + (i + 1) + " : ");
            String firstName = input.nextLine();

            System.out.print("Enter Last Name for Person #" + (i+1) + " : ");
            String lastName = input.nextLine();

            System.out.print("Enter # of siblings : ");
            int num_siblings = input.nextInt();
            input.nextLine();

            Person[] siblings = new Person[num_siblings];

            for ( int j = 0 ; j < num_siblings ; j++ ) {
                System.out.print("Enter First Name for Sibling #" + (j + 1) + " : ");
                String siblingFirstName = input.nextLine();

                System.out.print("Enter Last Name for Sibling #" + (j+1) + " : ");
                String siblingLastName = input.nextLine();

                siblings[j] = new Person(siblingFirstName, siblingLastName);
            }

            persons[i] = new Person(firstName, lastName, siblings);
        }


        for ( int i = 0 ; i < persons.length ; i++ ) {
            System.out.print("Person #" + (i + 1) + " :");
            System.out.println(persons[i].getLastName() + ", " + persons[i].getFirstName());


            if ( persons[i].getSiblings().length > 0 ) {
                for (int j = 0; j < persons[i].getSiblings().length; j++) {
                    System.out.println("\tSibling #" + (j+1) + ": " + persons[i].getSiblings()[j].getLastName() + ", " + persons[i].getSiblings()[j].getFirstName());
                }
            } else {
                System.out.println("Person #" + (i + 1) + " has no siblings");
            }


        }

    }
}
