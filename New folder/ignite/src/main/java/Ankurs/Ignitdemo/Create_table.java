package Ankurs.Ignitdemo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create_table 
{
	public static void main(String arg[])
	{
	// Register JDBC driver
	
	// Populate City table
	try 
	{
		Class.forName("org.apache.ignite.IgniteJdbcThinDriver");

		// Open JDBC connection
		Connection conn = DriverManager.getConnection("jdbc:ignite:thin://127.0.0.1/");
		java.sql.Statement stmt = conn.createStatement();
		 stmt.executeUpdate("CREATE TABLE City1 (" + 
				    " id LONG PRIMARY KEY, name VARCHAR) " +
				    " WITH \"template=replicated\"");

				    // Create table based on PARTITIONED template with one backup.
				    stmt.executeUpdate("CREATE TABLE Person1 (" +
				    " id LONG, name VARCHAR, city_id LONG, " +
				    " PRIMARY KEY (id, city_id)) " +
				    " WITH \"backups=1, affinityKey=city_id\"");
				  
				    // Create an index on the City table.
				    stmt.executeUpdate("CREATE INDEX idx_city_name2 ON City (name)");

				    // Create an index on the Person table.
				    stmt.executeUpdate("CREATE INDEX idx_person_name2 ON Person (name)");
				    System.out.println("Success");
	}
	catch(Exception ex)
	{
		
		System.out.println("Exception "+ex.getMessage());
		
	}
	
	}
}
