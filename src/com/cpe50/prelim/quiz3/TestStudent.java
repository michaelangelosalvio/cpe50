package com.prelim.salvio;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pleas enter the # of students:");
		int num_students = input.nextInt();
		input.nextLine();
		
		Student[] students = new Student[num_students];
		
		for ( int i = 0 ; i < students.length ; i++ ) {
			System.out.print("Please enter first name for student #" + (i+1) + " : ");
			String firstName = input.nextLine();
			
			System.out.print("Please enter last name for student #" + (i+1) + " : ");
			String lastName = input.nextLine();
			
			students[i] = new Student(firstName, lastName);
			
			String option = "Y";
			
			int c = 1;
			do{
			
				System.out.print("Please enter raw score for quiz #" + c + " for student #" + (i+1) + " : " );
				double rawScore = input.nextDouble();
				input.nextLine();
					
				System.out.print("Please enter total score for quiz #" + c + " for student #" + (i+1) + " : " );
				double totalScore = input.nextDouble();
				input.nextLine();
				
				Quiz quiz = new Quiz(rawScore, totalScore);
				
				students[i].getQuizzes().add(quiz);
				
				System.out.print("Do you like to continue ? (Y/N) : ");
				option = input.nextLine();
						
				c++;
			} while( option.toLowerCase().equals("y") );
			
			
			
		}
		
		for ( Student student : students ) {
			System.out.println(student.getLastName() + ", " + student.getFirstName() + " - " + computeGrade(student));;
		}
	}
	
	public static double computeGrade(Student student){
		
		
		double rawScore = 0, totalScore = 0;
		
		for ( Quiz quiz : student.getQuizzes() ) {
			rawScore += quiz.getRawScore();
			totalScore += quiz.getTotalScore();
		}
		
		if ( rawScore / totalScore >= 0.6 ) {
			return 37.5 + rawScore / totalScore * 62.5;
		} else {
			return 60 + rawScore / totalScore * 25;
		}
		
			
	}
}
