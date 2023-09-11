package com.amdocs.input;

import java.sql.SQLException;
import java.util.Scanner;
import com.amdocs.dao.CustomerDao;
import com.amdocs.dao.impl.CustomerDaoImpl;

public class DeleteCustomer 
{
	private static Scanner sc=new Scanner(System.in);
	static CustomerDao dao=new CustomerDaoImpl();
	public void removeCustomer()throws SQLException
	{
		System.out.println("Enter the ID to be deleted");
		int id=Integer.parseInt(sc.nextLine());
		boolean flag=dao.deleteCustomer(id);
		if(flag)
		{
			System.out.println("Customer deleted");
		}
		else
		{
			System.out.println("Customer does not exist");
		}
	}
}
