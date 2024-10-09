package show;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
	
	ResultSet resultSet = connection.prepareStatement("select * from emp").executeQuery();
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
	}
	connection.close();
}
}
