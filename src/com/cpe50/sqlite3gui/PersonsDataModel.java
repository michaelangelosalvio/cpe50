package com.cpe50.sqlite3gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class PersonsDataModel {
	Connection conn;
	Statement statement;
	PreparedStatement preparedStatement;

	public PersonsDataModel(){
		try{
			
			conn = DriverManager.getConnection("jdbc:sqlite:mydb.db");
			System.out.println("Connection successful");
			
			Statement statement = conn.createStatement();
			
			/**
			 * creating table structure
			 */
			
			String sql = "create table if not exists students ("
					+ "student_no text,"
					+ "last_name text,"
					+ "first_name text )";
			statement.execute(sql);
			
			
			String insertQuery = "insert into students (student_no, first_name, last_name)"
					+ "values (?,?,?)";
			
			preparedStatement = conn.prepareStatement(insertQuery);							
			
		} catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void addStudent(String studentNo, String firstName ,String lastName){
		
		
		try {
			preparedStatement.setString(1, "");
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
