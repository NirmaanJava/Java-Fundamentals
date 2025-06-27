package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/data";
		String user = "root";
		String password = "root";

		try (Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM users")) {

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.println("ID: " + id + ", Name: " + name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
