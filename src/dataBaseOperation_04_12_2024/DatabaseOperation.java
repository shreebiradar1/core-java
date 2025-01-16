package dataBaseOperation_04_12_2024;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperation {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/school_management";
		String user = "root";
		String pass = "Shree@123";
		
		Connection connection = DriverManager.getConnection(url, user, pass);
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("Select * from Student");
		
//		statement.execute("");
		
		while(result.next()) {
			for(int i = 1; i<=5; i++) {
				System.out.println(result.getString(i));		
			}
			System.out.println("---------------------------------");
		}
	}
}
