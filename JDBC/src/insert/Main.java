package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
	
	PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?)");
	preparedStatement.setInt(1, 121);
	preparedStatement.setString(2,"arjun");
	preparedStatement.executeUpdate();
	System.out.println("inserted");
	connection.close();
}
}
