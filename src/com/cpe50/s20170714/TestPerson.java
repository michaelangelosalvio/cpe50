package com.cpe50.s20170714;

import java.util.Scanner;

/**
 * Created by msalvio on 14/07/17.
 */
public class TestPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter # of Persons: ");
        int numberOfPerson = input.nextInt();
        input.nextLine();

        Person[] persons = new Person[numberOfPerson];
        for ( int i = 0 ; i < persons.length ; i++ ) {
            System.out.print("Enter name of Person #" + (i+1) + ":" );
            String name = input.nextLine();
            persons[i] = new Person(name);

            Person[] parents = new Person[2];

            System.out.print("Enter mother of Person #" + (i+1) + ":");
            String motherName = input.nextLine();
            parents[0] = new Person(motherName);

            System.out.print("Enter father of Person #" + (i+1) + ":");
            String fatherName = input.nextLine();
            parents[1] = new Person(fatherName);

            persons[i].setParents(parents);

            System.out.print("Enter # of friends of Person #" + (i+1) + ":" );
            int numOfFriends = input.nextInt();
            input.nextLine();

            Person[] friends = new Person[numOfFriends];

            for ( int j = 0 ; j < friends.length ; j++ ) {
                System.out.print("Enter friend #" + (j+1) + " of Person #" + (i+1) + ":");
                String friendName = input.nextLine();
                friends[j] = new Person(friendName);
            }

            persons[i].setFriends(friends);
        }

        display(persons);
    }

    public static void display(Person[] persons){
        for ( int i = 0 ; i < persons.length ; i++ ) {
            System.out.println("Person #" + (i+1) + ":");
            System.out.println(persons[i]);
        }
    }
}
