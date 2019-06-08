package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/test1?serverTimezone=UTC";
			String user = "dbadmin";
			String password = "passta2";
			connection = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		}catch(SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return connection;
	}

}
