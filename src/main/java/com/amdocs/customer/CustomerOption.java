package com.amdocs.customer;

import java.sql.SQLException;
import java.util.Scanner;

import com.amdocs.input.RegisterCustomer;
import com.amdocs.input.ModifyCustomer;
import com.amdocs.input.DeleteCustomer;
import com.amdocs.input.DisplayAllCustomers;
import com.amdocs.input.SearchCustomerById;
//import com.amdocs.dao.CustomerDao;
//import com.amdocs.dao.impl.CustomerDaoImpl;

public class CustomerOption 
{
	private static RegisterCustomer reg=new RegisterCustomer();
	private static ModifyCustomer mod=new ModifyCustomer();
	private static DeleteCustomer del=new DeleteCustomer();
	private static SearchCustomerById sea=new SearchCustomerById();
	private static DisplayAllCustomers disall=new DisplayAllCustomers();
	//private static CustomerDao dao=new CustomerDaoImpl();
	private static Scanner sc=new Scanner(System.in);
	public static void customerService()throws SQLException
	{
		System.out.println("-----Welcome to Customer portal-----");
		boolean flag=true;
		while(flag)
    	{
			try
			{
				System.out.println("Enter your choice:");
				System.out.println("1. Register Customer");
				System.out.println("2. Modify Customer details");
				System.out.println("3. Delete Customer details");
				System.out.println("4. View single record");
				System.out.println("5. View all records");
				System.out.println("0. Back to Main Menu");
				int ch = Integer.parseInt(sc.nextLine());
				switch (ch) 
				{
					case 1:
						System.out.println("Register Customer");
						reg.inputNewCustomer();
						break;
					case 2:
						System.out.println("Modify Customer details");
						mod.updateCustomer();
						break;
					case 3:
						System.out.println("Delete Customer details");
						del.removeCustomer();
						break;
					case 4:
						System.out.println("View single record");
						sea.displayCustomerById();
						break;
					case 5:
						System.out.println("View all records");
						disall.showingAllCustomers();
						break;
					case 0:
						flag=false;
						break;
					default:
						System.out.println("O Oo Wrong choice!! Enter again");
						break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("O Oo Wrong choice!! Enter again");
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
    	}
	}
}