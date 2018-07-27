package com.cpe50_1st_sem_20182019;


public class Person {
	private String name;
	private Pet[] pets;
	public Person(String name, Pet[] pets) {
		this.name = name;
		this.pets = pets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pet[] getPets() {
		return pets;
	}
	public void setPets(Pet[] pets) {
		this.pets = pets;
	} 
	
	@Override
	public String toString() {
		String content = "";
		content += "Name : " + this.name + "\n";
		for ( int i = 0 ; i < this.pets.length ; i++  ) {
			content += "Pet#" + (i+1) + " : " + this.pets[i].getName() + "\n";
		}
		
		return content;
	}
	
	
}
