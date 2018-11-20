package Ankurs.Ignitdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.ignite.*;
import org.apache.ignite.IgniteJdbcThinDriver;
import org.apache.ignite.internal.sql.*;
import org.apache.ignite.internal.client.impl.connection.*;


public class JDBC_demo 
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
		PreparedStatement stmt =conn.prepareStatement("INSERT INTO City (id, Name) VALUES (?, ?)" );
		 
		
	    stmt.setLong(1, 19L);
	    stmt.setString(2, "Forest Hill");
	    stmt.executeUpdate();

	    stmt.setLong(1, 20L);
	    stmt.setString(2, "Denver");
	    stmt.executeUpdate();

	    stmt.setLong(1, 21L);
	    stmt.setString(2, "ankur");
	    stmt.executeUpdate();
	    
	    
	    stmt.setLong(1, 22L);
	    stmt.setString(2, "John Doe");
	    stmt.setLong(3, 3L);
	    stmt.executeUpdate();
	    
	    stmt =conn.prepareStatement("INSERT INTO Person (id, name, city_id) VALUES (?, ?, ?)");

	    stmt.setLong(1, 5L);
	    stmt.setString(2, "new ankur");
	    stmt.setLong(3, 2L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 6L);
	    stmt.setString(2, "hello");
	    stmt.setLong(3, 3L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 7L);
	    stmt.setString(2, "sharma");
	    stmt.setLong(3, 5L);
	    stmt.executeUpdate();
	    System.out.println("Success");
	}
	catch(Exception ex)
	{
		
		System.out.println("Exception "+ex.getMessage());
		
	}
	finally 
	{
	
	}
      /* stmt =conn.prepareStatement("INSERT INTO Person (id, name, city_id) VALUES (?, ?, ?)");
	// Populate Person table
	try {
		

	    stmt.setLong(1, 1L);
	    stmt.setString(2, "John Doe");
	    stmt.setLong(3, 3L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 2L);
	    stmt.setString(2, "Jane Roe");
	    stmt.setLong(3, 2L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 3L);
	    stmt.setString(2, "Mary Major");
	    stmt.setLong(3, 1L);
	    stmt.executeUpdate();

	    stmt.setLong(1, 4L);
	    stmt.setString(2, "Richard Miles");
	    stmt.setLong(3, 2L);
	    stmt.executeUpdate();
	}
	finally
	{
		
		
	}
*/
}
}