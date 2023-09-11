package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;
import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.CustomerDaoImpl;

public class SearchCustomerById 
{
	private static Scanner sc=new Scanner(System.in);
	private static CustomerDao dao=new CustomerDaoImpl();
	public void displayCustomerById()throws SQLException
	{
		try
		{
			System.out.println("Enter the ID to be shown");
			int id=Integer.parseInt(sc.nextLine());
			if(dao.findCustomerById(id)!=null)
			{
				System.out.println(dao.findCustomerById(id));
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered character/characters is not a number ID");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
