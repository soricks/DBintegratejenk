package com.connectdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleJavaJDBCExample {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
		String USER = "sys as sysdba";
		String PASS = "sorit";
		
		// Creating Connection
		
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				System.out.println("driver loaded successfully");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Connection is successfull with"+""+conn);
				
				//Creating Table in DB
				/*
				  stmt = conn.createStatement();
				  String query = "CREATE TABLE EMPLOYEE " + "(EMPID INTEGER not NULL, " +
				  " FIRSTNAME VARCHAR(255), " + " LASTNAME VARCHAR(255), " +
				  " PRIMARY KEY ( EMPID ))";
				  
				  stmt.executeUpdate(query);
				  System.out.println("SQL Table created successfully...");
				
				  //Inserting Values in DB
				  String insert1 = "INSERT INTO EMPLOYEE VALUES (100, 'John', 'Doe')";
				  stmt = conn.createStatement();
				  stmt.execute(insert1);
				  //sql = "INSERT INTO EMPLOYEE VALUES (101, 'Jane', 'Smith')";
				  //stmt.executeUpdate(sql); 
				  //sql = "INSERT INTO EMPLOYEE VALUES (102, 'Alice', 'Johnson')";
				  //stmt.executeUpdate(sql);
				  //System.out.println("Inserted records into the table...");
				  stmt = conn.createStatement();
				  
				  */
				  String QUERY = "SELECT EMPID, FIRSTNAME, LASTNAME FROM EMPLOYEE";
				  ResultSet rs = stmt.executeQuery(QUERY);
					while(rs.next()){
			            //Display values
			            System.out.print("EMPID: " + rs.getInt("EMPID"));
			            System.out.print(", FIRSTNAME: " + rs.getString("FIRSTNAME"));
			            System.out.println(", LASTNAME: " + rs.getString("LASTNAME"));
					}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
	*/
	public static void connectDB() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
		String USER = "sys as sysdba";
		String PASS = "sorit";
		// Creating Connection
		
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				System.out.println("driver loaded successfully");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Connection is successfull with"+""+conn);
				
				
				/*
				//Creating Table in DB
				
				stmt = conn.createStatement();
				
				  String query = "CREATE TABLE EMPLOYEE " + "(EMPID INTEGER not NULL, " +
				  " FIRSTNAME VARCHAR(255), " + " LASTNAME VARCHAR(255), " +
				  " PRIMARY KEY ( EMPID ))";
				  
				  stmt.executeUpdate(query);
				  System.out.println("SQL Table created successfully...");
				
				  // Inserting Values in DB
			
				  String insert1 = "INSERT INTO EMPLOYEE VALUES (100, 'John', 'Doe')";
				  stmt = conn.createStatement();
				  stmt.execute(insert1);
				  String insert2 = "INSERT INTO EMPLOYEE VALUES (101, 'Jane', 'Smith')";
				  stmt.executeUpdate(insert2); 
				  String insert3= "INSERT INTO EMPLOYEE VALUES (102, 'Alice', 'Johnson')";
				  stmt.executeUpdate(insert3);
				  System.out.println("Inserted records into the table...");
				  stmt = conn.createStatement();
				  */
				  String QUERY = "SELECT EMPID, FIRSTNAME, LASTNAME FROM EMPLOYEE";
				  ResultSet rs = stmt.executeQuery(QUERY);
					while(rs.next()){
			            //Display values
			            System.out.print("EMPID: " + rs.getInt("EMPID"));
			            System.out.print(", FIRSTNAME: " + rs.getString("FIRSTNAME"));
			            System.out.println(", LASTNAME: " + rs.getString("LASTNAME"));
					}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
}

		
	


