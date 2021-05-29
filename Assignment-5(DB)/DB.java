import java.sql.*;
import java.io.*;
public class Db
{
	public static void main(String []args)
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection c=DriverManager.getConnection("jdbc:ucanaccess://F//Eclipse//Test//A1.accdb");
			Statement s=c.createStatement();
			System.out.println("Connection established")'
			s.execute("create table Mark(USN varchar,Mark1 number,Mark2 number)");
			System.out.println("Table created");
			s.executeUpdate("insert into Mark values '4al18cs022',99,100);
			s.executeUpdate("insert into Mark values '4al18cs021',100,99);
			System.out.println("Inserted");
			ResultSet r=s.executeQuery("select from Marks");
			System.out.println("The records in the table are:");
			while(r.next())
			{
				String usn=r.getString("USN");
				int mark1=r.getInt("Mark1");
				int mark2=r.getInt("Mark2");
				System.out.println(usn+","+mark1+","+mark2);
			}	
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	