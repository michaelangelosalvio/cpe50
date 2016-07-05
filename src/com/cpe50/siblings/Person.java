package com.cpe50.siblings;

/**
 * Created by msalvio on 05/07/16.
 */
public class Person {
    private String firstName, lastName;
    private Person[] siblings;

    public Person(String firstName, String lastName, Person[] siblings) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.siblings = siblings;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person[] getSiblings() {
        return siblings;
    }

    public void setSiblings(Person[] siblings) {
        this.siblings = siblings;
    }
}
