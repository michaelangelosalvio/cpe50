package  com.cpe50.entermfirstquiz;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DBConnection {
	
	Connection conn;
	Statement statement;
	PreparedStatement insertStatement;
	
	public DBConnection(){
		try{
			this.conn = DriverManager.getConnection("jdbc:sqlite:mydb.db");
			this.statement = this.conn.createStatement();
			
			this.statement.execute("create table if not exists persons(id integer primary key, name text)");
			System.out.println("Connected");
			
			insertStatement = this.conn.prepareStatement("insert into persons (name) values (?)");
		}catch( SQLException e ){
			e.printStackTrace();
		}		
	}
	
	public void addPerson(String name){
		try{
			insertStatement.setString(1, name);
			insertStatement.executeUpdate();
		} catch ( SQLException e ) {
			e.printStackTrace();
		}		
	}
	
	public ArrayList<String> getPersons(){
		try {
			ArrayList<String> names = new ArrayList<String>();
			ResultSet rs = this.statement.executeQuery("select * from persons");
			while ( rs.next() ){
				names.add( rs.getString("name") );
			}
			
			return names;
			
		} catch( SQLException e ) {
			e.printStackTrace();
		}
		
		return null;
	}
}
