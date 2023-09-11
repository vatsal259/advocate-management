package com.amdocs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil 
{
	private static final String URL="jdbc:mysql://127.0.0.1:3306/managementdb";
	private static final String USER_NAME="USERNAME";
	private static final String PASSWORD="PASSWORD";
	private static Connection connection;
	public static Connection getConnection()
	{
		try
		{
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}
		catch(SQLException e)
		{
			System.out.println("Problem with Database connection");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}
}
