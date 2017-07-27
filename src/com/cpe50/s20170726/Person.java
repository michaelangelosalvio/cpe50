package com.cpe50.s20170726;

import java.util.ArrayList;


public class Person {
	private ArrayList<Person> friends;
	private String name;
	

	public Person(String name) {		
		this.name = name;
	}
	public ArrayList<Person> getFriends() {
		return friends;
	}
	public void setFriends(ArrayList<Person> friends) {
		this.friends = friends;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
