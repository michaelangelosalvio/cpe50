package com.cpe50.sqlite3gui;

public class Person {
    private int id;
    private String firstName, lastName;

    public Person(String firstName, String lastName, int id) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
