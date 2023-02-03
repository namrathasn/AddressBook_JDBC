package AddressBookJDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * steps to follow to connect Java application with database 1) Import java.sql
 * 2) Load and register the driver 3) Create connection 4) Create a statement
 * 5)Execute the query 6) Process the results 7) Close resources
 */

public class AddressBookConnection {
	/**
	 * Connecting program to database
	 */
	public static final String URL = "jdbc:mysql://localhost:3306/address_book_system?useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "root15";
	public static Connection connection = null;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
