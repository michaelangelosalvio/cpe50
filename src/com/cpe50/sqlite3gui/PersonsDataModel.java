package com.cpe50.sqlite3gui;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class PersonsDataModel {
	Connection conn;
	Statement statement;
	PreparedStatement preparedStatement, deletePreparedStatement, updatePreparedStatement;
	JTable table;

	public PersonsDataModel(JTable table){
		try{

            this.table = table;

			this.conn = DriverManager.getConnection("jdbc:sqlite:mydb.db");
			System.out.println("Connection successful");
			
			this.statement = conn.createStatement();
			
			/**
			 * creating table structure
			 */
			
			String sql = "create table if not exists persons ("
					+ "id integer primary key,"
					+ "last_name text,"
					+ "first_name text )";
			this.statement.execute(sql);
			
			
			String insertQuery = "insert into persons (first_name, last_name)"
					+ "values (?,?)";
			
			preparedStatement = conn.prepareStatement(insertQuery);

            deletePreparedStatement = conn.prepareStatement("delete from persons where id = ?");
            updatePreparedStatement = conn.prepareStatement("update persons set first_name = ?, last_name = ? where id = ?");

		} catch(SQLException e){
			e.printStackTrace();
		}
		
	}
	
	public void addPerson(String firstName, String lastName){
		
		
		try {
			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, lastName);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public void updateTableUI(){
        try {

            ArrayList<Person> persons = new ArrayList<Person>();
            ResultSet rs = this.statement.executeQuery("select * from persons");
            while ( rs.next() ) {
                persons.add(new Person(rs.getString("first_name"),rs.getString("last_name"),rs.getInt("id")));
            }

            ((PersonTableModel)table.getModel()).setPersons(persons);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deletePerson(int id){
        try {
                deletePreparedStatement.setInt(1,id);
                deletePreparedStatement.executeUpdate();
                this.updateTableUI();

        } catch ( SQLException e ){
            e.printStackTrace();
        }
    }

    public void updatePerson(int id, String first_name, String last_name){
        try {
            updatePreparedStatement.setString(1, first_name);
            updatePreparedStatement.setString(2, last_name);
            updatePreparedStatement.setInt(3,id);
            updatePreparedStatement.executeUpdate();
            this.updateTableUI();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
