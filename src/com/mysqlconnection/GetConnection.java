package com.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public   class GetConnection {

	public static Connection getconnection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/relations","root","root");
	return connection ;
	}
	
}
