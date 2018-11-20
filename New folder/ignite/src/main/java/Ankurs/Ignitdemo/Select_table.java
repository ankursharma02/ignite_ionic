package Ankurs.Ignitdemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select_table 
{
	public static void main(String[] args) 
	{
		try
		{
			
			Class.forName("org.apache.ignite.IgniteJdbcThinDriver");

			// Open JDBC connection
			Connection conn = DriverManager.getConnection("jdbc:ignite:thin://127.0.0.1/");
			java.sql.Statement stmt =conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("SELECT * FROM City");
			System.out.println("ID        "+"Name ");
			while(rs.next())
			{
				System.out.println("---------------------------------");
				System.out.println(rs.getString(1)+" \t  "+rs.getString(2));
				System.out.println("---------------------------------");
			}
		   
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
