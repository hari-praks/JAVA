package application;
import java.sql.*;
public class Setupjdbc {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		try
		{
			Connection con =null;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:80/hari","root","");
			System.out.println("Connection is Successful");
			con.close();
			
		}
		catch(SQLException a)
		{
			System.out.println(a.getMessage());
		}

	}

}
