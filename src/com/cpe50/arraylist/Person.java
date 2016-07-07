package com.cpe50.arraylist;

public class Person {
    private String firstName, lastName;
    private Person[] siblings;

    public Person(){

    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Person[] siblings){
        this.firstName = firstName;
        this.lastName = lastName;
        this.siblings = siblings;
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

    public String toString(){
        return getLastName() + ", " + getFirstName();
    }

}
