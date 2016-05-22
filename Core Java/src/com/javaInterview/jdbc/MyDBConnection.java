package com.javaInterview.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MyDBConnection {

	private static final DateFormat dateFormat = new SimpleDateFormat(
			"yyyy/MM/dd HH:mm:ss");
	
	public static void main(String[] args) throws SQLException {

		Connection connection = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		CallableStatement callableStatement = null;

		String createTableSQL = "CREATE TABLE DBUSER(" + "USER_ID NUMBER(5) NOT NULL, "
				+ "USERNAME VARCHAR(20) NOT NULL, " + "CREATED_BY VARCHAR(20) NOT NULL, "
				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) " + ")";

		String insertTableSQL = "INSERT INTO DBUSER"
				+ "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) " + "VALUES"
				+ "(1,'Manish','system', " + "to_date('"
				+ getCurrentTimeStamp() + "', 'yyyy/mm/dd hh24:mi:ss'))";
		
		String updateTableSQL = "UPDATE DBUSER"
				+ " SET USERNAME = 'Manish_new' "
				+ " WHERE USER_ID = 1";
		
		String deleteTableSQL = "DELETE DBUSER WHERE USER_ID = 1";
		
		String selectTableSQL = "SELECT USER_ID, USERNAME from DBUSER";
		
		String insertTableSQLps = "INSERT INTO DBUSER"
				+ "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
				+ "(?,?,?,?)";
		
		try {
			
			//REGISTER the JDBC drivers (java.lang.Class class to load the JDBC drivers directly)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//OPEN A CONNECTION to a database (Specifying a Database URL, User Name, and Password)
			//Select your driver type : thin, oci, kprb...
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Manish", "manish");
			
			//CREATE a STATEMENT Object
			statement = connection.createStatement();
			
			/* CREATE */
			//statement.execute(createTableSQL);
			//System.out.println("Table \"dbuser\" is created!");
			
			/* INSERT */
			//statement.executeUpdate(insertTableSQL);
			//System.out.println("Record is inserted into DBUSER table!");
			
			/* UPDATE */
			//statement.execute(updateTableSQL);
			//System.out.println("Record is updated to DBUSER table!");
			
			/* DELETE */
			//statement.execute(deleteTableSQL);
			//System.out.println("Record is deleted from DBUSER table!");
			
			/* EXECUTE */
			/*ResultSet rs = statement.executeQuery(selectTableSQL);
			while (rs.next()) {
				String userid = rs.getString("USER_ID");
				String username = rs.getString("USERNAME");

				System.out.println("userid : " + userid);
				System.out.println("username : " + username);
			}*/
			
			//CREATE a PREPARESTATEMENT Object
			preparedStatement = connection.prepareStatement(insertTableSQLps);
			// CREATE, INSERT, UPDATE, DELETE (all same except queries) 
			/*
			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "Manish");
			preparedStatement.setString(3, "system");
			preparedStatement.setTimestamp(4, getCurrentTimeStampts());

			preparedStatement.executeUpdate();
			System.out.println("Record is inserted into DBUSER table!");*/
			
			//CREATE a CALLABLESTATEMENT Object
			//CALL STRORED PROCEDURE using IN Parameter 
			callableStatement = connection.prepareCall("{call insertDBUSER(?,?,?,?)}");

			/*callableStatement.setInt(1, 1000);
			callableStatement.setString(2, "Manish");
			callableStatement.setString(3, "system");
			callableStatement.setDate(4, getCurrentDate());

			// execute insertDBUSER store procedure
			callableStatement.executeUpdate();
			System.out.println("Record is inserted into DBUSER table!");*/
			
			//CALL STORED PROCEDURE using IN and OUT Parameters
			callableStatement = connection.prepareCall("{call getDBUSERByUserId(?,?,?,?)}");

			callableStatement.setInt(1, 11); //USERID HAS TO BE in DB
			callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(4, java.sql.Types.DATE);

			// execute getDBUSERByUserId store procedure
			callableStatement.executeUpdate();

			String userName = callableStatement.getString(2);
			String createdBy = callableStatement.getString(3);
			java.sql.Date createdDate = callableStatement.getDate(4);

			System.out.println("UserName : " + userName);
			System.out.println("CreatedBy : " + createdBy);
			System.out.println("CreatedDate : " + createdDate);
			
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
	
	private static String getCurrentTimeStamp() {
		java.util.Date today = new java.util.Date();
		return dateFormat.format(today.getTime());
	}
	
	private static java.sql.Timestamp getCurrentTimeStampts() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());
	}
	
	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}

}
