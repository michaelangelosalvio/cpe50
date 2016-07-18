package com.prelim.salvio;

import java.util.ArrayList;

public class Student {
	private String firstName, lastName;
	private ArrayList<Quiz> quizzes;
	
	
	
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.quizzes = new ArrayList<Quiz>();
		
		
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
	public ArrayList<Quiz> getQuizzes() {
		return quizzes;
	}
	public void setQuizzes(ArrayList<Quiz> quizzes) {
		this.quizzes = quizzes;
	}
	
	
}
