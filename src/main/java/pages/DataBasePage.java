package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	String columnValue = null;
	// for more than two extract from DB we can use Arraylist
//	List<String> datalist = new ArrayList<String>();

	public String getData(String columnName) throws SQLException {
		// setting properties for MySql

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/july2021";
			String sqlUserName = "root";
			String sqlPassWord = "root";
			String query = " select * from users";

			// create connection to local database

			connection = DriverManager.getConnection(sqlUrl, sqlUserName, sqlPassWord);

			// Empowering the connection reference variable to execute queries
			statement = connection.createStatement();

			// Delivering the query
			resultset = statement.executeQuery(query);

			while (resultset.next()) {
				columnValue = resultset.getString(columnName);
				return columnValue;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultset != null) {

				resultset.close();
			}
			if (connection != null) {
				connection.close();

			}

		}
		return columnValue;
	}

}
