package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Queries {
	
	private static final String INSERT_INTO_CUSTOMER = 
			"INSERT INTO CUSTOMER (cust_id, first_name, last_name, phone) "+
			" VALUES  (?, ?, ?, ?)";
	private static int index=1;
	
	public static void insertIntoCustomer(	Integer cust_id,
															String firstName,
															String lastName,
															String phone) {
		PreparedStatement preparedStatement = prepareStatement(INSERT_INTO_CUSTOMER);		
		setNullInteger(preparedStatement, cust_id);
		setString(preparedStatement, firstName);
		setString(preparedStatement, lastName);
		setString(preparedStatement, phone);
		executeUpdate(preparedStatement);
		
		resetPreparedStatementIndex();
	}	

	private static PreparedStatement prepareStatement(String sql) {
		
		PreparedStatement preparedStatement = null;
		
		Connection connection = MyConnection.getConnection();
		try {
			preparedStatement = connection.prepareStatement(INSERT_INTO_CUSTOMER);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return preparedStatement;
	}
	
	private static void setNullInteger(PreparedStatement preparedStatement,Integer integer) {
		try {
			preparedStatement.setNull(index++, java.sql.Types.INTEGER);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void setInt(PreparedStatement preparedStatement,Integer integer) {
		try {
			preparedStatement.setInt(index++, integer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void setString(PreparedStatement preparedStatement,String string) {
		try {
			preparedStatement.setString(index++, string);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void executeUpdate(PreparedStatement preparedStatement) {
		try {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void resetPreparedStatementIndex() {
		index=1;
	}

}



